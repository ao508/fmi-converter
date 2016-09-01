package org.cbio.portal.pipelines.foundation.model;

import java.io.Serializable;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 *
 * @author Prithi Chakrapani, ochoaa
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RearrangementType", propOrder = {
    "comment",
    "content",
    "description",
    "inFrame",
    "otherGene",
    "pos1",
    "pos2",
    "status",
    "supportingReadPairs",
    "targetedGene"
})
public class RearrangementType {
     
    @XmlElement(name = "comment", required = false)
     protected String comment;
     
    @XmlMixed
    protected List<Serializable> content;

    @XmlAttribute(name = "description")
    protected String description;

    @XmlAttribute(name = "in-frame")
    protected String inFrame;

    @XmlAttribute(name = "other-gene")
    protected String otherGene;

    @XmlAttribute(name = "pos1")
    protected String pos1;

    @XmlAttribute(name = "pos2")
    protected String pos2;

    @XmlAttribute(name = "status")
    protected String status;
 
    @XmlAttribute(name = "supporting-read-pairs")
    protected Short supportingReadPairs;
  
    @XmlAttribute(name = "targeted-gene")
    protected String targetedGene;


    /**
     * @return the content
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }    
    
    /**
     * @param content the content to set
     */
    public void setContent(List<Serializable> content) {
        this.content = content;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the inFrame
     */
    public String getInFrame() {
        return inFrame;
    }

    /**
     * @param inFrame the inFrame to set
     */
    public void setInFrame(String inFrame) {
        this.inFrame = inFrame;
    }

    /**
     * @return the otherGene
     */
    public String getOtherGene() {
        return otherGene;
    }

    /**
     * @param otherGene the otherGene to set
     */
    public void setOtherGene(String otherGene) {
        this.otherGene = otherGene;
    }

    /**
     * @return the pos1
     */
    public String getPos1() {
        return pos1;
    }

    /**
     * @param pos1 the pos1 to set
     */
    public void setPos1(String pos1) {
        this.pos1 = pos1;
    }

    /**
     * @return the pos2
     */
    public String getPos2() {
        return pos2;
    }

    /**
     * @param pos2 the pos2 to set
     */
    public void setPos2(String pos2) {
        this.pos2 = pos2;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the supportingReadPairs
     */
    public Short getSupportingReadPairs() {
        return supportingReadPairs;
    }

    /**
     * @param supportingReadPairs the supportingReadPairs to set
     */
    public void setSupportingReadPairs(Short supportingReadPairs) {
        this.supportingReadPairs = supportingReadPairs;
    }

    /**
     * @return the targetedGene
     */
    public String getTargetedGene() {
        return targetedGene;
    }

    /**
     * @param targetedGene the targetedGene to set
     */
    public void setTargetedGene(String targetedGene) {
        this.targetedGene = targetedGene;
    }
    
 }