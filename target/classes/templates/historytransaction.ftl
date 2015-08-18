<!DOCTYPE html>
<html>
<head>
	<title>History Transaction</title>
</head>

<body>
	<div align="center">
		<h1>History Transaction</h1>
		<a href="/admin">Admin page</a> </br>
		<a href="/">Home page</a> </br>
		<table class="coffee">
    		<tr>
        		<th width="200">Name</th>
        		<th width="120">Address</th>
        		<th width="120">Age</th>
        		<th width="120">Identity Card</th>
        		<th width="120">Phone Number</th>
        		<th width="200">Time</th>
        		<th width="60">Money</th>
   			 </tr>
    		<#list listTransaction as transaction>
       		 <tr>
            	<td style = "text-align:center">${transaction.name}</td>
            	<td style = "text-align:center">${transaction.address}</td>
            	<td style = "text-align:center">${transaction.age}</td>
            	<td style = "text-align:center">${transaction.id}</td>
            	<td style = "text-align:center">${transaction.phoneNumber}</td>
            	<td style = "text-align:center">${transaction.datetime}</td>
            	<td style = "text-align:center">${transaction.money}$</td>
        	</tr>
    		</#list>
    	</table>
	</div>
</body>

</html>