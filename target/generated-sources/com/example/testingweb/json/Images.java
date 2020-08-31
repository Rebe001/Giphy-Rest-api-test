
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
    "original",
    "downsized",
    "downsized_large",
    "downsized_medium",
    "downsized_small",
    "downsized_still",
    "fixed_height",
    "fixed_height_downsampled",
    "fixed_height_small",
    "fixed_height_small_still",
    "fixed_height_still",
    "fixed_width",
    "fixed_width_downsampled",
    "fixed_width_small",
    "fixed_width_small_still",
    "fixed_width_still",
    "looping",
    "original_still",
    "original_mp4",
    "preview",
    "preview_gif",
    "preview_webp",
    "480w_still"
})
public class Images {

    @JsonProperty("original")
    private Original original;
    @JsonProperty("downsized")
    private Downsized downsized;
    @JsonProperty("downsized_large")
    private DownsizedLarge downsizedLarge;
    @JsonProperty("downsized_medium")
    private DownsizedMedium downsizedMedium;
    @JsonProperty("downsized_small")
    private DownsizedSmall downsizedSmall;
    @JsonProperty("downsized_still")
    private DownsizedStill downsizedStill;
    @JsonProperty("fixed_height")
    private FixedHeight fixedHeight;
    @JsonProperty("fixed_height_downsampled")
    private FixedHeightDownsampled fixedHeightDownsampled;
    @JsonProperty("fixed_height_small")
    private FixedHeightSmall fixedHeightSmall;
    @JsonProperty("fixed_height_small_still")
    private FixedHeightSmallStill fixedHeightSmallStill;
    @JsonProperty("fixed_height_still")
    private FixedHeightStill fixedHeightStill;
    @JsonProperty("fixed_width")
    private FixedWidth fixedWidth;
    @JsonProperty("fixed_width_downsampled")
    private FixedWidthDownsampled fixedWidthDownsampled;
    @JsonProperty("fixed_width_small")
    private FixedWidthSmall fixedWidthSmall;
    @JsonProperty("fixed_width_small_still")
    private FixedWidthSmallStill fixedWidthSmallStill;
    @JsonProperty("fixed_width_still")
    private FixedWidthStill fixedWidthStill;
    @JsonProperty("looping")
    private Looping looping;
    @JsonProperty("original_still")
    private OriginalStill originalStill;
    @JsonProperty("original_mp4")
    private OriginalMp4 originalMp4;
    @JsonProperty("preview")
    private Preview preview;
    @JsonProperty("preview_gif")
    private PreviewGif previewGif;
    @JsonProperty("preview_webp")
    private PreviewWebp previewWebp;
    @JsonProperty("480w_still")
    private com.example.testingweb.json._480wStill _480wStill;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("original")
    public Original getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(Original original) {
        this.original = original;
    }

    @JsonProperty("downsized")
    public Downsized getDownsized() {
        return downsized;
    }

    @JsonProperty("downsized")
    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    @JsonProperty("downsized_large")
    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    @JsonProperty("downsized_large")
    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    @JsonProperty("downsized_medium")
    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    @JsonProperty("downsized_medium")
    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    @JsonProperty("downsized_small")
    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    @JsonProperty("downsized_small")
    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    @JsonProperty("downsized_still")
    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    @JsonProperty("downsized_still")
    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    @JsonProperty("fixed_height")
    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    @JsonProperty("fixed_height")
    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    @JsonProperty("fixed_height_downsampled")
    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    @JsonProperty("fixed_height_downsampled")
    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    @JsonProperty("fixed_height_small")
    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    @JsonProperty("fixed_height_small")
    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    @JsonProperty("fixed_height_small_still")
    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    @JsonProperty("fixed_height_small_still")
    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    @JsonProperty("fixed_height_still")
    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    @JsonProperty("fixed_height_still")
    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    @JsonProperty("fixed_width")
    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    @JsonProperty("fixed_width")
    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    @JsonProperty("fixed_width_downsampled")
    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    @JsonProperty("fixed_width_downsampled")
    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    @JsonProperty("fixed_width_small")
    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    @JsonProperty("fixed_width_small")
    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    @JsonProperty("fixed_width_small_still")
    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    @JsonProperty("fixed_width_small_still")
    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    @JsonProperty("fixed_width_still")
    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    @JsonProperty("fixed_width_still")
    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    @JsonProperty("looping")
    public Looping getLooping() {
        return looping;
    }

    @JsonProperty("looping")
    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    @JsonProperty("original_still")
    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    @JsonProperty("original_still")
    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    @JsonProperty("original_mp4")
    public OriginalMp4 getOriginalMp4() {
        return originalMp4;
    }

    @JsonProperty("original_mp4")
    public void setOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
    }

    @JsonProperty("preview")
    public Preview getPreview() {
        return preview;
    }

    @JsonProperty("preview")
    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    @JsonProperty("preview_gif")
    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    @JsonProperty("preview_gif")
    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

    @JsonProperty("preview_webp")
    public PreviewWebp getPreviewWebp() {
        return previewWebp;
    }

    @JsonProperty("preview_webp")
    public void setPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
    }

    @JsonProperty("480w_still")
    public com.example.testingweb.json._480wStill get480wStill() {
        return _480wStill;
    }

    @JsonProperty("480w_still")
    public void set480wStill(com.example.testingweb.json._480wStill _480wStill) {
        this._480wStill = _480wStill;
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
        sb.append(Images.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("original");
        sb.append('=');
        sb.append(((this.original == null)?"<null>":this.original));
        sb.append(',');
        sb.append("downsized");
        sb.append('=');
        sb.append(((this.downsized == null)?"<null>":this.downsized));
        sb.append(',');
        sb.append("downsizedLarge");
        sb.append('=');
        sb.append(((this.downsizedLarge == null)?"<null>":this.downsizedLarge));
        sb.append(',');
        sb.append("downsizedMedium");
        sb.append('=');
        sb.append(((this.downsizedMedium == null)?"<null>":this.downsizedMedium));
        sb.append(',');
        sb.append("downsizedSmall");
        sb.append('=');
        sb.append(((this.downsizedSmall == null)?"<null>":this.downsizedSmall));
        sb.append(',');
        sb.append("downsizedStill");
        sb.append('=');
        sb.append(((this.downsizedStill == null)?"<null>":this.downsizedStill));
        sb.append(',');
        sb.append("fixedHeight");
        sb.append('=');
        sb.append(((this.fixedHeight == null)?"<null>":this.fixedHeight));
        sb.append(',');
        sb.append("fixedHeightDownsampled");
        sb.append('=');
        sb.append(((this.fixedHeightDownsampled == null)?"<null>":this.fixedHeightDownsampled));
        sb.append(',');
        sb.append("fixedHeightSmall");
        sb.append('=');
        sb.append(((this.fixedHeightSmall == null)?"<null>":this.fixedHeightSmall));
        sb.append(',');
        sb.append("fixedHeightSmallStill");
        sb.append('=');
        sb.append(((this.fixedHeightSmallStill == null)?"<null>":this.fixedHeightSmallStill));
        sb.append(',');
        sb.append("fixedHeightStill");
        sb.append('=');
        sb.append(((this.fixedHeightStill == null)?"<null>":this.fixedHeightStill));
        sb.append(',');
        sb.append("fixedWidth");
        sb.append('=');
        sb.append(((this.fixedWidth == null)?"<null>":this.fixedWidth));
        sb.append(',');
        sb.append("fixedWidthDownsampled");
        sb.append('=');
        sb.append(((this.fixedWidthDownsampled == null)?"<null>":this.fixedWidthDownsampled));
        sb.append(',');
        sb.append("fixedWidthSmall");
        sb.append('=');
        sb.append(((this.fixedWidthSmall == null)?"<null>":this.fixedWidthSmall));
        sb.append(',');
        sb.append("fixedWidthSmallStill");
        sb.append('=');
        sb.append(((this.fixedWidthSmallStill == null)?"<null>":this.fixedWidthSmallStill));
        sb.append(',');
        sb.append("fixedWidthStill");
        sb.append('=');
        sb.append(((this.fixedWidthStill == null)?"<null>":this.fixedWidthStill));
        sb.append(',');
        sb.append("looping");
        sb.append('=');
        sb.append(((this.looping == null)?"<null>":this.looping));
        sb.append(',');
        sb.append("originalStill");
        sb.append('=');
        sb.append(((this.originalStill == null)?"<null>":this.originalStill));
        sb.append(',');
        sb.append("originalMp4");
        sb.append('=');
        sb.append(((this.originalMp4 == null)?"<null>":this.originalMp4));
        sb.append(',');
        sb.append("preview");
        sb.append('=');
        sb.append(((this.preview == null)?"<null>":this.preview));
        sb.append(',');
        sb.append("previewGif");
        sb.append('=');
        sb.append(((this.previewGif == null)?"<null>":this.previewGif));
        sb.append(',');
        sb.append("previewWebp");
        sb.append('=');
        sb.append(((this.previewWebp == null)?"<null>":this.previewWebp));
        sb.append(',');
        sb.append("_480wStill");
        sb.append('=');
        sb.append(((this._480wStill == null)?"<null>":this._480wStill));
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
        result = ((result* 31)+((this.preview == null)? 0 :this.preview.hashCode()));
        result = ((result* 31)+((this.downsizedMedium == null)? 0 :this.downsizedMedium.hashCode()));
        result = ((result* 31)+((this.downsizedSmall == null)? 0 :this.downsizedSmall.hashCode()));
        result = ((result* 31)+((this.fixedHeight == null)? 0 :this.fixedHeight.hashCode()));
        result = ((result* 31)+((this.previewWebp == null)? 0 :this.previewWebp.hashCode()));
        result = ((result* 31)+((this.fixedHeightStill == null)? 0 :this.fixedHeightStill.hashCode()));
        result = ((result* 31)+((this.fixedHeightSmall == null)? 0 :this.fixedHeightSmall.hashCode()));
        result = ((result* 31)+((this.originalMp4 == null)? 0 :this.originalMp4 .hashCode()));
        result = ((result* 31)+((this.previewGif == null)? 0 :this.previewGif.hashCode()));
        result = ((result* 31)+((this.fixedHeightSmallStill == null)? 0 :this.fixedHeightSmallStill.hashCode()));
        result = ((result* 31)+((this.downsizedLarge == null)? 0 :this.downsizedLarge.hashCode()));
        result = ((result* 31)+((this.fixedWidthStill == null)? 0 :this.fixedWidthStill.hashCode()));
        result = ((result* 31)+((this.fixedWidthDownsampled == null)? 0 :this.fixedWidthDownsampled.hashCode()));
        result = ((result* 31)+((this.original == null)? 0 :this.original.hashCode()));
        result = ((result* 31)+((this.fixedWidth == null)? 0 :this.fixedWidth.hashCode()));
        result = ((result* 31)+((this.fixedWidthSmallStill == null)? 0 :this.fixedWidthSmallStill.hashCode()));
        result = ((result* 31)+((this.looping == null)? 0 :this.looping.hashCode()));
        result = ((result* 31)+((this.downsizedStill == null)? 0 :this.downsizedStill.hashCode()));
        result = ((result* 31)+((this.fixedHeightDownsampled == null)? 0 :this.fixedHeightDownsampled.hashCode()));
        result = ((result* 31)+((this.originalStill == null)? 0 :this.originalStill.hashCode()));
        result = ((result* 31)+((this.fixedWidthSmall == null)? 0 :this.fixedWidthSmall.hashCode()));
        result = ((result* 31)+((this._480wStill == null)? 0 :this._480wStill.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.downsized == null)? 0 :this.downsized.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Images) == false) {
            return false;
        }
        Images rhs = ((Images) other);
        return (((((((((((((((((((((((((this.preview == rhs.preview)||((this.preview!= null)&&this.preview.equals(rhs.preview)))&&((this.downsizedMedium == rhs.downsizedMedium)||((this.downsizedMedium!= null)&&this.downsizedMedium.equals(rhs.downsizedMedium))))&&((this.downsizedSmall == rhs.downsizedSmall)||((this.downsizedSmall!= null)&&this.downsizedSmall.equals(rhs.downsizedSmall))))&&((this.fixedHeight == rhs.fixedHeight)||((this.fixedHeight!= null)&&this.fixedHeight.equals(rhs.fixedHeight))))&&((this.previewWebp == rhs.previewWebp)||((this.previewWebp!= null)&&this.previewWebp.equals(rhs.previewWebp))))&&((this.fixedHeightStill == rhs.fixedHeightStill)||((this.fixedHeightStill!= null)&&this.fixedHeightStill.equals(rhs.fixedHeightStill))))&&((this.fixedHeightSmall == rhs.fixedHeightSmall)||((this.fixedHeightSmall!= null)&&this.fixedHeightSmall.equals(rhs.fixedHeightSmall))))&&((this.originalMp4 == rhs.originalMp4)||((this.originalMp4 != null)&&this.originalMp4 .equals(rhs.originalMp4))))&&((this.previewGif == rhs.previewGif)||((this.previewGif!= null)&&this.previewGif.equals(rhs.previewGif))))&&((this.fixedHeightSmallStill == rhs.fixedHeightSmallStill)||((this.fixedHeightSmallStill!= null)&&this.fixedHeightSmallStill.equals(rhs.fixedHeightSmallStill))))&&((this.downsizedLarge == rhs.downsizedLarge)||((this.downsizedLarge!= null)&&this.downsizedLarge.equals(rhs.downsizedLarge))))&&((this.fixedWidthStill == rhs.fixedWidthStill)||((this.fixedWidthStill!= null)&&this.fixedWidthStill.equals(rhs.fixedWidthStill))))&&((this.fixedWidthDownsampled == rhs.fixedWidthDownsampled)||((this.fixedWidthDownsampled!= null)&&this.fixedWidthDownsampled.equals(rhs.fixedWidthDownsampled))))&&((this.original == rhs.original)||((this.original!= null)&&this.original.equals(rhs.original))))&&((this.fixedWidth == rhs.fixedWidth)||((this.fixedWidth!= null)&&this.fixedWidth.equals(rhs.fixedWidth))))&&((this.fixedWidthSmallStill == rhs.fixedWidthSmallStill)||((this.fixedWidthSmallStill!= null)&&this.fixedWidthSmallStill.equals(rhs.fixedWidthSmallStill))))&&((this.looping == rhs.looping)||((this.looping!= null)&&this.looping.equals(rhs.looping))))&&((this.downsizedStill == rhs.downsizedStill)||((this.downsizedStill!= null)&&this.downsizedStill.equals(rhs.downsizedStill))))&&((this.fixedHeightDownsampled == rhs.fixedHeightDownsampled)||((this.fixedHeightDownsampled!= null)&&this.fixedHeightDownsampled.equals(rhs.fixedHeightDownsampled))))&&((this.originalStill == rhs.originalStill)||((this.originalStill!= null)&&this.originalStill.equals(rhs.originalStill))))&&((this.fixedWidthSmall == rhs.fixedWidthSmall)||((this.fixedWidthSmall!= null)&&this.fixedWidthSmall.equals(rhs.fixedWidthSmall))))&&((this._480wStill == rhs._480wStill)||((this._480wStill!= null)&&this._480wStill.equals(rhs._480wStill))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.downsized == rhs.downsized)||((this.downsized!= null)&&this.downsized.equals(rhs.downsized))));
    }

}
