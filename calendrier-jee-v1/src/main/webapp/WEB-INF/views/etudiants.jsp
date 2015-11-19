<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<head>
<link rel="stylesheet" type="text/css" 	href="<%=request.getContextPath()%>/resources/css/commons-style.css" />	
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/bootstrap-min-3-0.css" />
</head>

<div class="errors">${exception}</div>

<%-- <div class="main-entry cadre">
	<img alt="" src="<%=request.getContextPath()%>/resources/images/cursus-ingesup.png">
</div>
 --%>
<div id="formEtudiant" class="contenaire">
	<span>
		<a href="<c:url value='/j_spring_security_logout' />">Logout</a> 
		FILL THE STUDENT'S FORM
	</span> <br>
	<img alt="" src="<%=request.getContextPath()%>/resources/images/cursus-ingesup.png"><br>
	<f:form modelAttribute="etudiant" action="saveEtudiant" method="POST">
		<div class="fixed-table-responsive">
			<table class="table table-hover">
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
			<%-- <tr>
				<td>Date de Naissance</td>
				<td><f:input path="dateNaissance"/></td>
				<td><f:errors path="dateNaissance" cssClass="errors"></f:errors></td> 
			</tr> --%>
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
				<td><input type="submit" value="Enregistrer" /></td>
			</tr>
		</table>
		</div>
		
	</f:form>
</div>

