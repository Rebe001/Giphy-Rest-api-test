
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
    "height",
    "width",
    "size",
    "url",
    "mp4_size",
    "mp4",
    "webp_size",
    "webp",
    "frames",
    "hash"
})
public class Original {

    @JsonProperty("height")
    private String height;
    @JsonProperty("width")
    private String width;
    @JsonProperty("size")
    private String size;
    @JsonProperty("url")
    private String url;
    @JsonProperty("mp4_size")
    private String mp4Size;
    @JsonProperty("mp4")
    private String mp4;
    @JsonProperty("webp_size")
    private String webpSize;
    @JsonProperty("webp")
    private String webp;
    @JsonProperty("frames")
    private String frames;
    @JsonProperty("hash")
    private String hash;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("width")
    public String getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(String width) {
        this.width = width;
    }

    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("mp4_size")
    public String getMp4Size() {
        return mp4Size;
    }

    @JsonProperty("mp4_size")
    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
    }

    @JsonProperty("mp4")
    public String getMp4() {
        return mp4;
    }

    @JsonProperty("mp4")
    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    @JsonProperty("webp_size")
    public String getWebpSize() {
        return webpSize;
    }

    @JsonProperty("webp_size")
    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    @JsonProperty("webp")
    public String getWebp() {
        return webp;
    }

    @JsonProperty("webp")
    public void setWebp(String webp) {
        this.webp = webp;
    }

    @JsonProperty("frames")
    public String getFrames() {
        return frames;
    }

    @JsonProperty("frames")
    public void setFrames(String frames) {
        this.frames = frames;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
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
        sb.append(Original.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("mp4Size");
        sb.append('=');
        sb.append(((this.mp4Size == null)?"<null>":this.mp4Size));
        sb.append(',');
        sb.append("mp4");
        sb.append('=');
        sb.append(((this.mp4 == null)?"<null>":this.mp4));
        sb.append(',');
        sb.append("webpSize");
        sb.append('=');
        sb.append(((this.webpSize == null)?"<null>":this.webpSize));
        sb.append(',');
        sb.append("webp");
        sb.append('=');
        sb.append(((this.webp == null)?"<null>":this.webp));
        sb.append(',');
        sb.append("frames");
        sb.append('=');
        sb.append(((this.frames == null)?"<null>":this.frames));
        sb.append(',');
        sb.append("hash");
        sb.append('=');
        sb.append(((this.hash == null)?"<null>":this.hash));
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
        result = ((result* 31)+((this.mp4 == null)? 0 :this.mp4 .hashCode()));
        result = ((result* 31)+((this.webpSize == null)? 0 :this.webpSize.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.frames == null)? 0 :this.frames.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.mp4Size == null)? 0 :this.mp4Size.hashCode()));
        result = ((result* 31)+((this.webp == null)? 0 :this.webp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.hash == null)? 0 :this.hash.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Original) == false) {
            return false;
        }
        Original rhs = ((Original) other);
        return ((((((((((((this.mp4 == rhs.mp4)||((this.mp4 != null)&&this.mp4 .equals(rhs.mp4)))&&((this.webpSize == rhs.webpSize)||((this.webpSize!= null)&&this.webpSize.equals(rhs.webpSize))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.frames == rhs.frames)||((this.frames!= null)&&this.frames.equals(rhs.frames))))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))))&&((this.mp4Size == rhs.mp4Size)||((this.mp4Size!= null)&&this.mp4Size.equals(rhs.mp4Size))))&&((this.webp == rhs.webp)||((this.webp!= null)&&this.webp.equals(rhs.webp))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.hash == rhs.hash)||((this.hash!= null)&&this.hash.equals(rhs.hash))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}
