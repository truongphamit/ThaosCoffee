<!DOCTYPE html>
<html>
<head>
	<title>ThaosCoffee</title>
</head>

<body> 
	<div align="center">
	<h1>ThaosCoffee</h1>
	<h3>Coffee changes the world!</h3>
	<a href="/">Home page</a>
	<h3>Order</h3>
	<form action = "/custommer/oder" >
		Your name: <input type="text" name="name" /> <br/>
		Address: <input type="text" name="address" /> <br/>
		Identity Card: <input type="text" name="id" /> <br/>
		Phone number: <input type="text" name="phoneNumber"/> <br/>
		Age: <input type="number" min = "0" name="age" value = "5"/>
		<h3>Coffee List</h3>
    	<table class="coffee">
    		<tr>
        		<th width="120">Name</th>
        		<th width="120">Price</th>
        		<th width="10">Quantity</th>
    		</tr>
    		<#list listCoffees as coffee>
        	<tr>
           		<td style = "text-align:center">${coffee.name}</td>
            	<td style = "text-align:center">${coffee.price}$</td>
            	<td>
    				<input type="number" min = "0" name="coffeeQuantity" value = "0" required/> 
            	</td>
        	</tr>
    		</#list>
    	</table>
    
   		<h3>Spices List</h3>
    	<table class="spices">
    		<tr>
        		<th width="120">Name</th>
        		<th width="120">Price</th>
        		<th width="10">Quantity</th>
    		</tr>
    		<#list listSpices as spices>
        	<tr>
            	<td style = "text-align:center">${spices.name}</td>
            	<td style = "text-align:center">${spices.price}$</td>
            	<td>
            		<input type="number" min = "0" name="spicesQuantity" value = "0" required/>
            	</td>
        	</tr>
    		</#list>
    	</table>
    	<input type="submit" value="Order" />
    	<input type="reset">
    </form>
	
	</div>
</body>

</html>