function eliminar (id){
	swal({
  title: "Esta seguro de Eliminar?",
  text: "¡Una vez eliminado, no podrás recuperar este registro!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	$.ajax({
		url:"/eliminar/"+id,
		success: function(res){
			console.log(res);
		}
	});
    swal("¡Tu registro ha sido eliminado!", {
      icon: "success",
    }).then((OK)=>{
	if(OK){
		location.href="/listar";
	}
});
  } else {
    swal("¡Su registro está seguro!");
  }
});
}