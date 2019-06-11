$(document).ready(function() {

	$("#btnGet").on("click", function() {
		$.ajax({
			url : "rest/adelium",
			type : "get",
			dataType : "html",
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
			dataType : "html",
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
			dataType : "html",
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
			dataType : "html",
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