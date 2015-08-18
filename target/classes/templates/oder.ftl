<html>
<body>
	<div align="center">
	<h1>Order's ${custommer.name}</h1>
	Your name: ${custommer.name} <br/>
	Address: ${custommer.address} <br/>
	Identity Card: ${custommer.id} <br/>
	Phone number: ${custommer.phoneNumber} <br/>
	Age: ${custommer.age} <br/>
	
	<table class="bill">
    <tr>
        <th width="80">Name</th>
        <th width="120">Quantity</th>
        <th width="120">Unit price</th>
        <th width="120">Total amount</th>
    </tr>
    <#list custommer.oderList.coffeeOders as coffeeOder>
        <tr>
            <td style = "text-align:center">${coffeeOder.coffee.name}</td>
            <td style = "text-align:center">${coffeeOder.quantity}</td>
            <td style = "text-align:center">${coffeeOder.coffee.price}$</td>
            <td style = "text-align:center">${coffeeOder.money}$</td>
        </tr>
    </#list>
    <#list custommer.oderList.spicesOders as spicesOder>
        <tr>
            <td style = "text-align:center">${spicesOder.spices.name}</td>
            <td style = "text-align:center">${spicesOder.quantity}</td>
            <td style = "text-align:center">${spicesOder.spices.price}$</td>
            <td style = "text-align:center">${spicesOder.money}$</td>
        </tr>
    </#list>
    </table>
    
	<h3>Total: ${custommer.money}$</h3>

	<form action="/custommer/oder/pay">
    	<input type="submit" value="Pay" />
  	</form>
	
	<form action="/custommer/oder/cancel">
    	<input type="submit" value="Cancel" />
  	</form>

</body>
<html> 