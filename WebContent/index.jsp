<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<script src="./sources.js"></script>

<title>Exercice Jersey</title>
</head>

<body>
	<div class="container">
		<br>
		<h2>Cliquez sur un bouton</h2>
		<br>

		<!-- Les boutons ci-dessous renvoient vers une autre page web quand ils sont cliqué -->
		<%-- <div class="input-group">
			<a href="${pageContext.request.contextPath}/rest/adelium">
				<button id="btnGet" type="button" class="btn btn-primary mb-3">Get</button>
			</a> <a href="${pageContext.request.contextPath}/rest/adelium">
				<button id="btnPost" type="button" class="btn btn-success mb-3">Post</button>
			</a> <a href="${pageContext.request.contextPath}/rest/adelium">
				<button id="btnPut" type="button" class="btn btn-warning mb-3">Put</button>
			</a> <a href="${pageContext.request.contextPath}/rest/adelium">
				<button id="btnDelete" type="button" class="btn btn-danger mb-3">Delete</button>
			</a>
		</div> --%>

		<!-- Boutons -->
		<div class="input-group">
			<button id="btnGet" type="button" class="btn btn-primary mb-3">Get</button>
			<button id="btnPost" type="button" class="btn btn-success mb-3">Post</button>
			<button id="btnPut" type="button" class="btn btn-warning mb-3">Put</button>
			<button id="btnDelete" type="button" class="btn btn-danger mb-3">Delete</button>
		</div>

		<!-- Texte -->
		<div class="input-group mb-3">
			<input id="txtResultat" type="text" class="form-control"
				value="Votre résultat ici" readonly>
		</div>
	</div>
</body>

</html>