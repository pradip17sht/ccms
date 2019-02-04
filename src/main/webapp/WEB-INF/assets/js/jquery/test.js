function getcity(countryid)
{
    $.post(BASE+'/user/index/index',{countryid:countryid},function(data){
        
        var data = JSON.decode(data);
        var opt='<select>';
        for(var i=0;i<data.length;i++)
        {
            opt+='<option>'+data[i]['cityname']+'</option>';
            
            
        }    
        opt+='</select>';
        $("#divid").html(opt);
    })
    
    
}