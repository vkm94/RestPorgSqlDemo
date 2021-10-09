package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="Loads")
public class LoadModel {
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getLoadId() {
		return loadId;
	}
	public void setLoadId(String loadId) {
		this.loadId = loadId;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(columnDefinition = "serial")
	
	Integer id;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private Integer noOfTrucks;
	double weight;
	private String comment;
	private String shipperId;
	private String loadId;
	//@DateTimeFormat(pattern="dd/MM/yyyy")

    @Temporal(TemporalType.TIMESTAMP)
	private Date dates;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public Integer getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(Integer noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getcOmment() {
		return comment;
	}
	public void setcOmment(String omment) {
		this.comment = omment;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}

	
	public LoadModel(Integer id, String loadingPoint, String unloadingPoint, String productType, String truckType,
			Integer noOfTrucks, double weight, String omment, String shipperId, String date,String loadId) {
		super();
		this.id = id;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = omment;
		this.shipperId = shipperId;
		
		this.loadId=loadId;
	}
	public LoadModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoadModel [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", omment=" + comment + ", shipperId=" + shipperId + ", dates=" + dates + ",loadId="+loadId+"]";
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}

}
