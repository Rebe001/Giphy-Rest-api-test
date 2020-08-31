
package com.example.testingweb.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "onload",
    "onclick",
    "onsent"
})
public class Analytics {

    @JsonProperty("onload")
    private Onload onload;
    @JsonProperty("onclick")
    private Onclick onclick;
    @JsonProperty("onsent")
    private Onsent onsent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("onload")
    public Onload getOnload() {
        return onload;
    }

    @JsonProperty("onload")
    public void setOnload(Onload onload) {
        this.onload = onload;
    }

    @JsonProperty("onclick")
    public Onclick getOnclick() {
        return onclick;
    }

    @JsonProperty("onclick")
    public void setOnclick(Onclick onclick) {
        this.onclick = onclick;
    }

    @JsonProperty("onsent")
    public Onsent getOnsent() {
        return onsent;
    }

    @JsonProperty("onsent")
    public void setOnsent(Onsent onsent) {
        this.onsent = onsent;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Analytics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("onload");
        sb.append('=');
        sb.append(((this.onload == null)?"<null>":this.onload));
        sb.append(',');
        sb.append("onclick");
        sb.append('=');
        sb.append(((this.onclick == null)?"<null>":this.onclick));
        sb.append(',');
        sb.append("onsent");
        sb.append('=');
        sb.append(((this.onsent == null)?"<null>":this.onsent));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.onsent == null)? 0 :this.onsent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.onload == null)? 0 :this.onload.hashCode()));
        result = ((result* 31)+((this.onclick == null)? 0 :this.onclick.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Analytics) == false) {
            return false;
        }
        Analytics rhs = ((Analytics) other);
        return (((((this.onsent == rhs.onsent)||((this.onsent!= null)&&this.onsent.equals(rhs.onsent)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.onload == rhs.onload)||((this.onload!= null)&&this.onload.equals(rhs.onload))))&&((this.onclick == rhs.onclick)||((this.onclick!= null)&&this.onclick.equals(rhs.onclick))));
    }

}
