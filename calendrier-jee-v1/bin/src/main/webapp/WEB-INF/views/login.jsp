<form name='loginForm'
	action="<c:url value='/auth/login_check?targetUrl=${targetUrl}' />"
	method='POST'>

	<table>
	<tr>
		<td>User:</td>
		<td><input type='text' name='username'></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type='password' name='password' /></td>
	</tr>

	<!-- if this is login for update, ignore remember me check -->
	<c:if test="${empty loginUpdate}">
	<tr>
		<td></td>
		<td>Remember Me: <input type="checkbox" name="remember-me" /></td>
	</tr>
	</c:if>

	<tr>
	        <td colspan='2'><input name="submit" type="submit"
		value="submit" /></td>
	</tr>

	</table>

	<input type="hidden" name="${_csrf.parameterName}"
		value="${_csrf.token}" />

  </form>