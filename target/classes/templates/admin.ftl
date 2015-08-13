<!DOCTYPE html>
<html>
<head>
	<title>Admin</title>
</head>
<body>
	<div align="center">
	<h1>ThaosCoffee manager</h1> 
    <a href="/">Home page</a>
	<h3>Coffee List</h3>
    <table class="coffee">
    <tr>
        <th width="80">ID</th>
        <th width="120">Name</th>
        <th width="120">Price</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <#list listCoffees as coffee>
        <tr>
            <td style = "text-align:center">${coffee.id}</td>
            <td style = "text-align:center">${coffee.name}</td>
            <td style = "text-align:center">${coffee.price}$</td>
            <td>
            	<form action="/admin/editcoffee/${coffee.id}">
            		<input type="submit" value="Edit" />
  				</form>
            </td>
            <td>
            	<form action="/admin/removecoffee/${coffee.id}" method="post">
            		<input type="submit" value="Delete" />
  				</form>
            </td>
            
        </tr>
    </#list>
    </table>
    <form action="/admin/addcoffee">
    	<input type="submit" value="Add Coffee">
	</form>
    
    <h3>Spices List</h3>
    <table class="spices">
    <tr>
        <th width="80">ID</th>
        <th width="120">Name</th>
        <th width="120">Price</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <#list listSpices as spices>
        <tr>
            <td style = "text-align:center">${spices.id}</td>
            <td style = "text-align:center">${spices.name}</td>
            <td style = "text-align:center">${spices.price}$</td>
            <td>
            	<form action="/admin/editspices/${spices.id}">
            		<input type="submit" value="Edit" />
  				</form>
            </td>
            <td>
            	<form action="/admin/removespices/${spices.id}" method="post">
            		<input type="submit" value="Delete" />
  				</form>
            </td>
        </tr>
    </#list>
    </table>
    <form action = "/admin/addspices">
    	<input type="submit" value="Add Spices" />
    </form>
    
    
</body>

</html>