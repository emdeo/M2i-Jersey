$(document).ready(function() {

	$("#btnGet").on("click", function() {
		$.ajax({
			url : "rest/adelium",
			type : "get",
			dataType : "text", // plusieurs types définis dans RestService (text_plain, text_xml...)
			success: function(res, state){
				
//				Résultat de la requête envoyée au service web RestService
				$("#txtResultat").val(res)
				
			},
			error: function (xhr) {
		        alert("Erreur " + xhr.status)
		    }
		})
	})

	$("#btnPost").on("click", function() {
		$.ajax({
			url : "rest/adelium",
			type : "post",
			// Pas besoin de préciser le dataType : 1 seule méthode définie dans le service web
			success: function(res, state){
				
//				Résultat de la requête envoyée au service web RestService
				$("#txtResultat").val(res)
				
			},
			error: function (xhr) {
		        alert("Erreur " + xhr.status)
		    }
		})
	})

	$("#btnPut").on("click", function() {
		$.ajax({
			url : "rest/adelium",
			type : "put",
			success: function(res, state){
				
//				Résultat de la requête envoyée au service web RestService
				$("#txtResultat").val(res)
				
			},
			error: function (xhr) {
		        alert("Erreur " + xhr.status)
		    }
		})
	})

	$("#btnDelete").on("click", function() {
		$.ajax({
			url : "rest/adelium",
			type : "delete",
			success: function(res, state){
				
//				Résultat de la requête envoyée au service web RestService
				$("#txtResultat").val(res)
				
			},
			error: function (xhr) {
		        alert("Erreur " + xhr.status)
		    }
		})
	})

})
