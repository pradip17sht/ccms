$(document).ready(function(){
  

// select element styling
    $('select.changeMe').each(function(){
        var id = $(this).attr('id');
        var title = $("#"+id+" option:first").text();
        if( $('option:selected', this).val() != ''  ) title = $('option:selected',this).text();
        $(this)
        .css({
            'z-index':3,
            'opacity':0,
            '-khtml-appearance':'none'
        })
        .after('<span class="select">' + title + '</span>')
        .change(function(){
            val = $('option:selected',this).text();
            $(this).next().text(val);
        })
    });

    loadindustry(); //loading the industry 
      
    //Industry selection and change specialityr
    $("#industry").change(function(){
        var industryid= $(this).val();
        if(industryid == -1)
        {
            $("#dialog-form *").removeClass("ui-state-error");
            $("#dialog-form input").val("");
            $( "#dialog-form" ).dialog( "open" );
            $(".validateTips").html("");
        }     
        else
        {
            //now posting the inddustry id
            var id = industryid.split("::");
            $.post("/build/business/analysis/op/getspeciality",{
                id:id[0]
                },function(data){
                //Generating speciality
                var speciality = $.JSON.decode(data);
                var html= '<option value="0">Select</option>';
                for(var i=0;i<speciality.length;i++)
                {
                    html+='<option value="'+speciality[i]['industry_id']+'::'+speciality[i]['name']+'">'+speciality[i]['name']+'</option>';
               
                }
                $("#speciality").html(html);
            });
        }
        
   
    })
      
//Country selection and stage changing  
  $("#country").change(function(){
                
        var countryid = $(this).val();
        countryid = countryid.split('::');
        $.post("/build/business/analysis/op/getstate",{
            id:countryid[0]
            },function(data){
            var statelist  = $.JSON.decode(data);
             
            var  html = '<option value="0">Select</option>';
            for(var i=0;i<statelist.length;i++)
            {
                html+='<option value="'+statelist[i]['state_id']+'::'+statelist[i]['name']+'">'+statelist[i]['name']+'</option>';
            }
            $("#state").html(html); 
             
        });
               
                
    })
      
    // modal form
    $( "#dialog-form" ).dialog({
        autoOpen: false,
        height: 370,
        width: 400,
        modal: true,
        buttons: {
            "Submit": function() {
                if(validateCustomIndustryForm())
                {
                    $( this ).dialog( "close" );
                                
                    $.post('/build/business/analysis/op/newindustry',$("#customindustry").serialize(),function(data){
                                     
                        if(data == 1)
                        {
                                      
                            loadindustry();
                                        
                        } 
                        else
                        {
                            openAlert('Industry already exists');
                                        
                        }   
                                        
                    })
                }
            },
            'Cancel': function() {
                $( this ).dialog( "close" );
            }
        },
        close: function() {
				
        }
    });
  
}) 

//load industry
function loadindustry()
{
    showLoading('Loading..');
    $.post('/build/business/analysis',{
        op:'getindustry'
    },function(data){
        var industrylist  = $.JSON.decode(data);
        if(industrylist[0].length<=0)
        {
            var  html = '<option value="0">Not available</option>';
            hideLoading();
        }    
        else
        {
            var  html = '<option value="0">Industry</option>';
            for(var i=0;i<industrylist.length;i++)
            {
                html+='<option value="'+industrylist[i]['industry_id']+'::'+industrylist[i]['name']+'">'+industrylist[i]['name']+'</option>';
            }
            html+='<option value="-1">Others</option>';
            $("#industry").html(html); 
            hideLoading();
        }       
          
    });
}

//form validation for custom industry
 function validateCustomIndustryForm()
 {
     var error = new Array();
    if($("#userindustry").val()=='')
     {
         $("#userindustry").addClass("ui-state-error");
         error.push("Please enter your industry");
         
     }
     if($("#userspeciality").val()=='')
     {
         $("#userspeciality").addClass("ui-state-error");
         error.push("Please enter your speciality");
     }   
     var html = '<b>Following Errors Occured</b><br/><br/>';
     if(error.length>0)
     {
     for(var i=0;i<error.length;i++)
     {
         html+=error[i]+'<br/>';
     }    
     $(".validateTips").html(html);
     return false;
     }
     else
     {
         return  true;
         
     }    
         
 }
 
 //for validation for mamin form
 function validateSearchKey()
 {
     var error = new Array();
     if($("#industry").val() == '' || $("#industry").val() == 0)
     {
        error.push('Please choose your industry type');
       
     }
     if($("#speciality").val() == '' || $("#speciality").val() == 0)
     {
          error.push('Please choose your speciality');
     }
     if($("#country").val() == '' || $("#country").val() == 0)
     {
          error.push('Please choose your country');
     }
     if($("#city").val() == '' || $("#city").val() == 0 || $("#city").val() == 'City')
     {
          error.push('Please enter your city');
     }
     if(error.length>0)
     {
         var html='Following errors ocurred.<br/>';
         for(var i=0;i<error.length;i++)
         {
             html+=error[i]+'<br/>';
         } 
         $(".errordiv").slideDown().html(html);
         return false;
         
     }    
     else
     {
        showLoading("We are analyzing your local industry, grading and <br/><br/> establishing an initial plan of attack! Please Be Patient..");
        $.post("/build/business/keywordresearch",$('#keywordresearchform').serialize(),function(data){
           var data = JSON.decode(data);
           var wonder = data['wonder'];
           var related_searches = data['related_searches'];
           var html = '<h1 style="text-align:left;">Let\'\s Discover Your Targeted Keywords</h1>';
           html+= '<p style="text-align:left; margin-bottom:30px;">We know you may not have a clue on how to build your online presence, or much less even want to take the time to find the right keywords to target... Not to worry, just select the industry details that best describes your company and location, and we\'\ll Discover the best keywords for you to start targeting!</p>';
           html+='<div id="video" style="float:right; position: relative ;width:290px; height:200px; margin-top:0px; "></div>';
           html+='<div style="float:left;">';
           html+='<h2>Keywords</h2>';
           html+='<div class="keywordresearch">';
          for(var i=0;i<wonder.length;i++)
          {
           html+='<ul class="ulkeywords">';
           html+='<span class="keyselect"><a href="javascript:void(0);" onclick="selectKeyword(\'parent\',this);">+</a></span><li>P'+(i+1)+'. '+wonder[i]['term'];
           html+='<ul>';
           var item = wonder[i]['children'];
           for(var j=0;j<item.length;j++)
           {
            html+='<span class="keyselect"><a href="javascript:void(0);" onclick="selectKeyword(\'child\',this);">+</a></span><li>C'+(j+1)+'. '+item[j]+'</li>';
           } 
           html+='</ul>';
           html+='</li>';
           html+='</ul>';
          }
          for(var k=0;k<related_searches.length;k++)
          { 
           html+='<ul class="ulkeywords">';
           html+='<span class="keyselect"><a href="javascript:void(0);" onclick="selectKeyword(\'parent\',this);">+</a></span><li>P'+(k+1)+'. '+related_searches[k]['term'];
           html+='<ul>';
           var relateditem = related_searches[k]['children'];
           for(var l=0;l<relateditem.length;l++)
           {
            html+='<span class="keyselect"><a href="javascript:void(0);" onclick="selectKeyword(\'child\',this);">+</a></span><li>C'+(l+1)+'. '+relateditem[l]+'</li>';
           }
           html+='</ul>';
           html+='</li>';
           html+='</ul>';
          } 
           html+='</div></div><div style="clear:both"></div><a href="javascript:void(0);" id="saveresearchkey" onclick="saveresearchkey();"><div id="button" style="margin:0 auto;">Next</div></a> ';
            $("#ajxdiv").html(html)  
            hideLoading();
         
            
        });
         
     }    
 }
 
function selectKeyword(type,e)
{
    if(type == 'parent')
    {
       if($(e).parent().parent('ul').children('li').attr('class')!= 'keydeselect')
       {
        $(e).parent().parent('ul').children('li').addClass('keydeselect');
        $(e).html("-");
        $(e).parent().parent('ul').children('li').children('ul').children('li').addClass('keydeselect');
        $(e).parent().parent('ul').children('li').children('ul').children('span').children('a').html('-');
        
       }
       else
       {
        $(e).parent().parent('ul').children('li').removeClass('keydeselect');
        $(e).html("+");
        $(e).parent().parent('ul').children('li').children('ul').children('li').removeClass('keydeselect');
        $(e).parent().parent('ul').children('li').children('ul').children('span').children('a').html('+');
           
       }
    }    
    else
    {
      if($(e).parent().next().attr('class')!= 'keydeselect')
      {
          $(e).parent().next().addClass('keydeselect');
          $(e).html("-");
      }
      else
      {
          $(e).parent().next().removeClass('keydeselect');
          $(e).html("+");
          
      }    
    }    
}

function saveresearchkey()
{
    var selectedkeys = new Array();
    $(".ulkeywords li").each(function(){
        if($(this).attr('class')!="keydeselect")
            if($(this).children())
            {
                selectedkeys.push($(this).clone().children().remove().end().text());
                
            }    
           else
            {
                selectedkeys.push($(this).text());
                
            }   
        
    })
    alert(selectedkeys);
    
    
}