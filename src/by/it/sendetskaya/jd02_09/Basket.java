//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.13 at 12:04:13 PM MSK 
//


package by.it.sendetskaya.jd02_09;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Basket complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Basket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdBuyerInBasket" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="IdGoodInBasket" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Basket", propOrder = {
    "idBuyerInBasket",
    "idGoodInBasket",
    "quantity",
    "sum"
})
public class Basket {

    @XmlElement(name = "IdBuyerInBasket", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idBuyerInBasket;
    @XmlElement(name = "IdGoodInBasket", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idGoodInBasket;
    @XmlElement(name = "Quantity", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;
    @XmlElement(name = "Sum")
    protected double sum;

    /**
     * Gets the value of the idBuyerInBasket property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdBuyerInBasket() {
        return idBuyerInBasket;
    }

    /**
     * Sets the value of the idBuyerInBasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdBuyerInBasket(BigInteger value) {
        this.idBuyerInBasket = value;
    }

    /**
     * Gets the value of the idGoodInBasket property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdGoodInBasket() {
        return idGoodInBasket;
    }

    /**
     * Sets the value of the idGoodInBasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdGoodInBasket(BigInteger value) {
        this.idGoodInBasket = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     */
    public double getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     */
    public void setSum(double value) {
        this.sum = value;
    }

}
