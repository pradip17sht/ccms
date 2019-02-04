/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
function showLoading(message)
{
   $('body').block({ 
                message: message, 
                css: { border: '3px solid #a00' } 
            }); 
		

}
function hideLoading()
{
    $('body').unblock();
}	

function openAlert(msg)
{
    	

	$('<div id="alert" style="font-size:13px;"></div>').dialog( { title: '',
											 draggable: true,
											 resizable: false,
											 modal: true,
											 width:650,
                                                                                         buttons:{'Ok':function(){$(this).dialog('close')}},
											open:function (){$(this).html(msg);}

											});
    
    
}