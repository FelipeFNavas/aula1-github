package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private Cliente cliente;
	private List<OrderItem> items = new ArrayList<>();
	
	public String toString() {
		return "Order moment: "
				+ moment
				+"\n"
				+"Order status: "
				+ status;
	}
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Cliente cliente) {
		super();
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem i) {
		items.add(i);
	}
	
	public void removeItem(OrderItem i) {
		items.remove(i);
	}
	
}
