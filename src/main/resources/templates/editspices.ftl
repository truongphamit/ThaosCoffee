<html>
<body>
	<div align="center">
	<a href="/admin">Admin page</a>
	<a href="/">Home page</a>
    <h3>Edit</h3>
    <form action="/admin/addspices" method="post">
   		ID: <input type="number" name="id" value=${item.id} readonly="readonly"/> <br/>
    	Name: <input type="text" name="name" value=${item.name} /> <br/>
    	Price: <input type="number" name="price" min = "0" step="any" value=${item.price} /> <br/>
    	<input type="submit" value="Save" />
    	<input type="reset">
    </form>
    
</body>	
<html> 