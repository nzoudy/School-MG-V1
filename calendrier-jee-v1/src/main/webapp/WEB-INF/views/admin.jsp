<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/commons-style.css" />
</head>

<div class="errors">${exception}</div>

<title>Admin Page</title>
</head>
<body>
	<h1>Admin page ! --->    Imagination at works !!</h1>

	<div id="formEtudiant" class="cadre">
		<a href="<c:url value='/j_spring_security_logout' />" >Logout</a>
		<span>FILL THE STUDENT'S FORM</span>
		<f:form modelAttribute="etudiant" action="saveEtudiant" method="POST">
			<table>
				<tr>
					<td>Nom</td>
					<td><f:input path="nomEtudiant" /></td>
					<td><f:errors path="nomEtudiant" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td>Prenom</td>
					<td><f:input path="prenom" /></td>
					<td><f:errors path="prenom" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td>Telephone</td>
					<td><f:input path="telephone" /></td>
					<td><f:errors path="telephone" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><f:input path="email" /></td>
					<td><f:errors path="email" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td><input type="submit" value="Enregistrer" /></td>
				</tr>
			</table>
		</f:form>
	</div>

	<div id="tabEtudiant" class="cadre">
		<table class="tab1">
			<tr>
				<th>ID Etudiant</th>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Telephone</th>
				<th>Email</th>
				<!-- <th>Nom Entreprise</th><th>Num Secu</th> -->
				<c:forEach items="${etudiants}" var="e">
					<tr>
						<td>${e.idEtudiant}</td>
						<td>${e.nomEtudiant}</td>
						<td>${e.prenom}</td>
						<td>${e.telephone}</td>
						<td>${e.email}</td>
						<%-- <td>${e.nomEntreprise}</td>
					<td>${e.numSecuriteSociale}</td> --%>
						<td><a href="suppEtudiant?idEtudiant=${e.idEtudiant}">Supprimer</a></td>
						<td><a href="editEtudiant?idEtudiant=${e.idEtudiant}">Editer</a></td>
					</tr>
				</c:forEach>
			</tr>
		</table>
	</div>
	
</body>
</html>