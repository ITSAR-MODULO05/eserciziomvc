<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CREAZIONE STUDENTE</title>
<link rel="stylesheet" href="css/layout.css">
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script src="js/postStudente.js"></script>
</head>
<body>
	<div id="main">
		<form method="POST"  action="/miglioli/add"	enctype="application/x-www-form-urlencoded" autocomplete="on">
			<div class="row">
				<div class="col-25">
					<label for="fname">Nome</label>
				</div>
				<div class="col-75">
					<input type="text" id="fname" size="40" maxlength="40" name="nome"
						placeholder="Nome.." required>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="lname">Cognome</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" size="40" maxlength="40"
						name="cognome" placeholder="Cognome.." required>
				</div>
			</div>
			<input id="postStudente" type="SUBMIT" class="navigateIn" value="inserisci">
		</form>
	</div>
</body>
</html>