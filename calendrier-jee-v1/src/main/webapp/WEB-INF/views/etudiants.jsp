<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<head>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/styleEtudiant.css" />
</head>

<div class="errors">
	${exception}
</div>

<div id="formEtudiant" class="cadre">
	<a href="<c:url value='/j_spring_security_logout' />" >Logout</a>
	<span>FILL THE STUDENT'S FORM</span>
	<f:form modelAttribute="etudiant" action="saveEtudiant" method="POST">
		<table>
			<tr>
				<td>Nom</td>
				<td><f:input path="nomEtudiant"/></td>
				<td><f:errors path="nomEtudiant" cssClass="errors"></f:errors></td> 
			</tr>
			<tr>
				<td>Prenom</td>
				<td><f:input path="prenom"/></td>
				<td><f:errors path="prenom" cssClass="errors"></f:errors></td> 
			</tr>
			<%-- <tr>
				<td>Date de Naissance</td>
				<td><f:input path="dateNaissance"/></td>
				<td><f:errors path="dateNaissance" cssClass="errors"></f:errors></td> 
			</tr> --%>
			<tr>
				<td>Telephone</td>
				<td><f:input path="telephone"/></td>
				<td><f:errors path="telephone" cssClass="errors"></f:errors></td> 
			</tr>
			<tr>
				<td>Email</td>
				<td><f:input path="email"/></td>
				<td><f:errors path="email" cssClass="errors"></f:errors></td> 
			</tr>
			<%-- <tr>
				<td>Nom Entreprise</td>
				<td><f:input path="nomEntreprise"/></td>
				<td><f:errors path="nomEntreprise" cssClass="errors"></f:errors></td> 
			</tr> --%>
			<%-- <tr>
				<td>Numéro Securite Sociale</td>
				<td><f:input path="numSecuriteSociale"/></td>
				<td><f:errors path="numSecuriteSociale" cssClass="errors"></f:errors></td> 
			</tr> --%>
			<%-- <tr>
				<td>Date Création du compte</td>
				<td><f:input path="dateCreationCompte"/></td>
				<td><f:errors path="dateCreationCompte" cssClass="errors"></f:errors></td> 
			</tr> --%>
			<%-- <tr>
				<td>Date dernière modification</td>
				<td><f:input path="dateDernierModification"/></td>
				<td><f:errors path="dateDernierModification" cssClass="errors"></f:errors></td> 
			</tr> --%>
			<%-- <tr>
				<td>Formation</td>
				<td><f:input path="formation"/></td>
				<td><f:errors path="formation" cssClass="errors"></f:errors></td> 
			</tr> --%>
			<%-- <tr>
				<td>Liste des Matière</td>
				<td><f:input path="matieres"/></td>
				<td><f:errors path="matiere" cssClass="errors"></f:errors></td> 
			</tr> --%>
			<tr>
				<td><input type="submit" value="Enregistrer"/></td>
			</tr>
		</table>
	</f:form>
</div>

<div id="tabEtudiant" class="cadre">
	<table class="tab1">
		<tr>
			<th>ID Etudiant</th><th>Nom</th><th>Prenom</th><th>Telephone</th><th>Email</th><!-- <th>Nom Entreprise</th><th>Num Secu</th> -->
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