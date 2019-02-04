
            <!-- Top Menu -->
             <div id="menu">
            	<ul class="topnav">
                   <li><a href="<?php echo $this->baseUrl();?>/user/dashboard" id="menu-task">Dashboard</a></li>
                          
                    <li><a href="#" id="menu-task">Config</a>
                    <ul class="subnav">
                            <li><a href="<?php echo $this->baseUrl();?>/admin/configuration/bankcode" id="bankcode">Bank code</a></li>
                            <li><a href="<?php echo $this->baseUrl();?>/admin/configuration/productcode" id="productcode">Product code</a></li>
                            <li><a href="<?php echo $this->baseUrl();?>/admin/configuration/branchcode" id="branchcode">Branch code</a></li>
                            <li><a href="<?php echo $this->baseUrl();?>/admin/configuration/departmentsetup" id="trafficcode">Department</a></li>
                            <li><a href="<?php echo $this->baseUrl();?>/admin/configuration/trafficcode" id="trafficcode">Traffic code</a></li>
                            <li><a href="<?php echo $this->baseUrl();?>/admin/configuration/clientcode" id="trafficcode">Client code</a></li>
                            <li><a href="<?php echo $this->baseUrl();?>/admin/configuration/accountcodesetup" id="trafficcode">Account number</a></li>
                            
                        </ul>
                    </li>
                    <li class="right" id="last"><a href="#" id="menu-layout">Layouts</a>
                        <!-- Dropdown Part -->
                        <ul class="subnav">
                            <li><a href="#" id="fixed-layout">Fixed Layout</a></li>
                            <li><a href="#" id="liquid-layout">Liquid Layout</a></li>
                        </ul>
                        <!-- End Dropdown Part -->
                    </li>
                </ul>
		  	</div>
<script type="text/javascript">
function setDeleteDialog(msg)
{
	if(msg === undefined) msg = '<?php echo _mytranslator('Are you sure, you wanted to delete this record ?') ?>';

	$('<div id="item_del" style="font-size:11px;"></div>').dialog( { title: '<?php echo _mytranslator('Confirm Delete') ?>',
											 draggable: true,
											 resizable: false,
											 modal: true,
											 width:650,
											 buttons: {
														'<?php echo _mytranslator('Yes') ?>': function() {$(this).dialog('close');return true},
														'<?php echo _mytranslator('No') ?>': function() {$( this ).dialog( "close" );}
														},
											open:function (){$(this).html(msg);}

											});
}
$(document).ready(function(){
    $(".content_left").attr('id','content_left');
})
</script>
          
<script>
  $(function(){
        	$("input, textarea, select, button").uniform();
      	});  
  $(document).ready(function(){
      
      $("#messagediv").hide().slideDown(300);
      setTimeout(messagehide,3500);
  })      
   function messagehide()
   {
       $("#messagediv").slideUp();
       $("#statusdiv").slideUp();
       
   }
 </script>