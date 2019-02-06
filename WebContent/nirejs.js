/**
 * 
 */
$('document').ready(function() {
	 alert("exekutatzennaiz");
	$('#provincia').on("change", function(e) {
		var provinciaSeleccionada = $(this).val();
		$('#poblacion option').show();
		$('#poblacion option').not('.' + provinciaSeleccionada).hide();
	});

	// checkari eventoa gehitu
	$("#condiciones").on("change", function(e) {

		$("#guardar").toggle();
	});

	$("#condiciones").change(function(e) {

		$("#guardar").toggle();
	});

});