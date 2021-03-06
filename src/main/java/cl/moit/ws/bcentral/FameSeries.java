//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.21 at 07:00:05 PM CLT 
//


package cl.moit.ws.bcentral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fameSeries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fameSeries">
 *   &lt;complexContent>
 *     &lt;extension base="{http://web.service.sdmx.sdms.sungard.com/}fameNode">
 *       &lt;sequence>
 *         &lt;element name="seriesKey" type="{http://web.service.sdmx.sdms.sungard.com/}seriesKey" minOccurs="0"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="obs" type="{http://web.service.sdmx.sdms.sungard.com/}obs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fameSeries", namespace = "http://web.service.sdmx.sdms.sungard.com/", propOrder = {
    "seriesKey",
    "precision",
    "obs"
})
public class FameSeries
    extends FameNode
{

    protected SeriesKey seriesKey;
    protected int precision;
    @XmlElement(nillable = true)
    protected List<Obs> obs;

    /**
     * Gets the value of the seriesKey property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesKey }
     *     
     */
    public SeriesKey getSeriesKey() {
        return seriesKey;
    }

    /**
     * Sets the value of the seriesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesKey }
     *     
     */
    public void setSeriesKey(SeriesKey value) {
        this.seriesKey = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     */
    public void setPrecision(int value) {
        this.precision = value;
    }

    /**
     * Gets the value of the obs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Obs }
     * 
     * 
     */
    public List<Obs> getObs() {
        if (obs == null) {
            obs = new ArrayList<Obs>();
        }
        return this.obs;
    }

}
