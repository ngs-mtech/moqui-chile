//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.21 at 07:00:05 PM CLT 
//


package cl.moit.ws.bcentral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Respuesta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Respuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Series" type="{http://bancocentral.org/}ArrayOfFameSeries" minOccurs="0"/>
 *         &lt;element name="SeriesInfos" type="{http://bancocentral.org/}ArrayOfInternetSeriesInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Respuesta", propOrder = {
    "codigo",
    "descripcion",
    "series",
    "seriesInfos"
})
public class Respuesta {

    @XmlElement(name = "Codigo", namespace = "http://bancocentral.org/")
    protected int codigo;
    @XmlElement(name = "Descripcion", namespace = "http://bancocentral.org/")
    protected String descripcion;
    @XmlElement(name = "Series", namespace = "http://bancocentral.org/")
    protected ArrayOfFameSeries series;
    @XmlElement(name = "SeriesInfos", namespace = "http://bancocentral.org/")
    protected ArrayOfInternetSeriesInfo seriesInfos;

    /**
     * Gets the value of the codigo property.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFameSeries }
     *     
     */
    public ArrayOfFameSeries getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFameSeries }
     *     
     */
    public void setSeries(ArrayOfFameSeries value) {
        this.series = value;
    }

    /**
     * Gets the value of the seriesInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInternetSeriesInfo }
     *     
     */
    public ArrayOfInternetSeriesInfo getSeriesInfos() {
        return seriesInfos;
    }

    /**
     * Sets the value of the seriesInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInternetSeriesInfo }
     *     
     */
    public void setSeriesInfos(ArrayOfInternetSeriesInfo value) {
        this.seriesInfos = value;
    }

}
