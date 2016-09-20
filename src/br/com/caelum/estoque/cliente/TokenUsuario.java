
package br.com.caelum.estoque.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tokenUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tokenUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataValidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tokenUsuario", propOrder = {
    "token",
    "dataValidade"
})
public class TokenUsuario {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String dataValidade;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the dataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataValidade() {
        return dataValidade;
    }

    /**
     * Sets the value of the dataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataValidade(String value) {
        this.dataValidade = value;
    }

}
