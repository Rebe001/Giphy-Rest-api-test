
package com.example.testingweb.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "url",
    "slug",
    "bitly_gif_url",
    "bitly_url",
    "embed_url",
    "username",
    "source",
    "title",
    "rating",
    "content_url",
    "tags",
    "featured_tags",
    "user_tags",
    "source_tld",
    "source_post_url",
    "is_sticker",
    "import_datetime",
    "trending_datetime",
    "images",
    "analytics_response_payload",
    "analytics"
})
public class Datum {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("bitly_gif_url")
    private String bitlyGifUrl;
    @JsonProperty("bitly_url")
    private String bitlyUrl;
    @JsonProperty("embed_url")
    private String embedUrl;
    @JsonProperty("username")
    private String username;
    @JsonProperty("source")
    private String source;
    @JsonProperty("title")
    private String title;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("content_url")
    private String contentUrl;
    @JsonProperty("tags")
    private List<Object> tags = new ArrayList<Object>();
    @JsonProperty("featured_tags")
    private List<Object> featuredTags = new ArrayList<Object>();
    @JsonProperty("user_tags")
    private List<Object> userTags = new ArrayList<Object>();
    @JsonProperty("source_tld")
    private String sourceTld;
    @JsonProperty("source_post_url")
    private String sourcePostUrl;
    @JsonProperty("is_sticker")
    private Integer isSticker;
    @JsonProperty("import_datetime")
    private String importDatetime;
    @JsonProperty("trending_datetime")
    private String trendingDatetime;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("analytics_response_payload")
    private String analyticsResponsePayload;
    @JsonProperty("analytics")
    private Analytics analytics;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("bitly_gif_url")
    public String getBitlyGifUrl() {
        return bitlyGifUrl;
    }

    @JsonProperty("bitly_gif_url")
    public void setBitlyGifUrl(String bitlyGifUrl) {
        this.bitlyGifUrl = bitlyGifUrl;
    }

    @JsonProperty("bitly_url")
    public String getBitlyUrl() {
        return bitlyUrl;
    }

    @JsonProperty("bitly_url")
    public void setBitlyUrl(String bitlyUrl) {
        this.bitlyUrl = bitlyUrl;
    }

    @JsonProperty("embed_url")
    public String getEmbedUrl() {
        return embedUrl;
    }

    @JsonProperty("embed_url")
    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("content_url")
    public String getContentUrl() {
        return contentUrl;
    }

    @JsonProperty("content_url")
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("featured_tags")
    public List<Object> getFeaturedTags() {
        return featuredTags;
    }

    @JsonProperty("featured_tags")
    public void setFeaturedTags(List<Object> featuredTags) {
        this.featuredTags = featuredTags;
    }

    @JsonProperty("user_tags")
    public List<Object> getUserTags() {
        return userTags;
    }

    @JsonProperty("user_tags")
    public void setUserTags(List<Object> userTags) {
        this.userTags = userTags;
    }

    @JsonProperty("source_tld")
    public String getSourceTld() {
        return sourceTld;
    }

    @JsonProperty("source_tld")
    public void setSourceTld(String sourceTld) {
        this.sourceTld = sourceTld;
    }

    @JsonProperty("source_post_url")
    public String getSourcePostUrl() {
        return sourcePostUrl;
    }

    @JsonProperty("source_post_url")
    public void setSourcePostUrl(String sourcePostUrl) {
        this.sourcePostUrl = sourcePostUrl;
    }

    @JsonProperty("is_sticker")
    public Integer getIsSticker() {
        return isSticker;
    }

    @JsonProperty("is_sticker")
    public void setIsSticker(Integer isSticker) {
        this.isSticker = isSticker;
    }

    @JsonProperty("import_datetime")
    public String getImportDatetime() {
        return importDatetime;
    }

    @JsonProperty("import_datetime")
    public void setImportDatetime(String importDatetime) {
        this.importDatetime = importDatetime;
    }

    @JsonProperty("trending_datetime")
    public String getTrendingDatetime() {
        return trendingDatetime;
    }

    @JsonProperty("trending_datetime")
    public void setTrendingDatetime(String trendingDatetime) {
        this.trendingDatetime = trendingDatetime;
    }

    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
    }

    @JsonProperty("analytics_response_payload")
    public String getAnalyticsResponsePayload() {
        return analyticsResponsePayload;
    }

    @JsonProperty("analytics_response_payload")
    public void setAnalyticsResponsePayload(String analyticsResponsePayload) {
        this.analyticsResponsePayload = analyticsResponsePayload;
    }

    @JsonProperty("analytics")
    public Analytics getAnalytics() {
        return analytics;
    }

    @JsonProperty("analytics")
    public void setAnalytics(Analytics analytics) {
        this.analytics = analytics;
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
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
        sb.append(',');
        sb.append("bitlyGifUrl");
        sb.append('=');
        sb.append(((this.bitlyGifUrl == null)?"<null>":this.bitlyGifUrl));
        sb.append(',');
        sb.append("bitlyUrl");
        sb.append('=');
        sb.append(((this.bitlyUrl == null)?"<null>":this.bitlyUrl));
        sb.append(',');
        sb.append("embedUrl");
        sb.append('=');
        sb.append(((this.embedUrl == null)?"<null>":this.embedUrl));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("rating");
        sb.append('=');
        sb.append(((this.rating == null)?"<null>":this.rating));
        sb.append(',');
        sb.append("contentUrl");
        sb.append('=');
        sb.append(((this.contentUrl == null)?"<null>":this.contentUrl));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("featuredTags");
        sb.append('=');
        sb.append(((this.featuredTags == null)?"<null>":this.featuredTags));
        sb.append(',');
        sb.append("userTags");
        sb.append('=');
        sb.append(((this.userTags == null)?"<null>":this.userTags));
        sb.append(',');
        sb.append("sourceTld");
        sb.append('=');
        sb.append(((this.sourceTld == null)?"<null>":this.sourceTld));
        sb.append(',');
        sb.append("sourcePostUrl");
        sb.append('=');
        sb.append(((this.sourcePostUrl == null)?"<null>":this.sourcePostUrl));
        sb.append(',');
        sb.append("isSticker");
        sb.append('=');
        sb.append(((this.isSticker == null)?"<null>":this.isSticker));
        sb.append(',');
        sb.append("importDatetime");
        sb.append('=');
        sb.append(((this.importDatetime == null)?"<null>":this.importDatetime));
        sb.append(',');
        sb.append("trendingDatetime");
        sb.append('=');
        sb.append(((this.trendingDatetime == null)?"<null>":this.trendingDatetime));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("analyticsResponsePayload");
        sb.append('=');
        sb.append(((this.analyticsResponsePayload == null)?"<null>":this.analyticsResponsePayload));
        sb.append(',');
        sb.append("analytics");
        sb.append('=');
        sb.append(((this.analytics == null)?"<null>":this.analytics));
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
        result = ((result* 31)+((this.embedUrl == null)? 0 :this.embedUrl.hashCode()));
        result = ((result* 31)+((this.sourcePostUrl == null)? 0 :this.sourcePostUrl.hashCode()));
        result = ((result* 31)+((this.bitlyUrl == null)? 0 :this.bitlyUrl.hashCode()));
        result = ((result* 31)+((this.rating == null)? 0 :this.rating.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.analytics == null)? 0 :this.analytics.hashCode()));
        result = ((result* 31)+((this.sourceTld == null)? 0 :this.sourceTld.hashCode()));
        result = ((result* 31)+((this.userTags == null)? 0 :this.userTags.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.bitlyGifUrl == null)? 0 :this.bitlyGifUrl.hashCode()));
        result = ((result* 31)+((this.slug == null)? 0 :this.slug.hashCode()));
        result = ((result* 31)+((this.importDatetime == null)? 0 :this.importDatetime.hashCode()));
        result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
        result = ((result* 31)+((this.trendingDatetime == null)? 0 :this.trendingDatetime.hashCode()));
        result = ((result* 31)+((this.featuredTags == null)? 0 :this.featuredTags.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.contentUrl == null)? 0 :this.contentUrl.hashCode()));
        result = ((result* 31)+((this.isSticker == null)? 0 :this.isSticker.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        result = ((result* 31)+((this.analyticsResponsePayload == null)? 0 :this.analyticsResponsePayload.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return (((((((((((((((((((((((((this.embedUrl == rhs.embedUrl)||((this.embedUrl!= null)&&this.embedUrl.equals(rhs.embedUrl)))&&((this.sourcePostUrl == rhs.sourcePostUrl)||((this.sourcePostUrl!= null)&&this.sourcePostUrl.equals(rhs.sourcePostUrl))))&&((this.bitlyUrl == rhs.bitlyUrl)||((this.bitlyUrl!= null)&&this.bitlyUrl.equals(rhs.bitlyUrl))))&&((this.rating == rhs.rating)||((this.rating!= null)&&this.rating.equals(rhs.rating))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.analytics == rhs.analytics)||((this.analytics!= null)&&this.analytics.equals(rhs.analytics))))&&((this.sourceTld == rhs.sourceTld)||((this.sourceTld!= null)&&this.sourceTld.equals(rhs.sourceTld))))&&((this.userTags == rhs.userTags)||((this.userTags!= null)&&this.userTags.equals(rhs.userTags))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.bitlyGifUrl == rhs.bitlyGifUrl)||((this.bitlyGifUrl!= null)&&this.bitlyGifUrl.equals(rhs.bitlyGifUrl))))&&((this.slug == rhs.slug)||((this.slug!= null)&&this.slug.equals(rhs.slug))))&&((this.importDatetime == rhs.importDatetime)||((this.importDatetime!= null)&&this.importDatetime.equals(rhs.importDatetime))))&&((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images))))&&((this.trendingDatetime == rhs.trendingDatetime)||((this.trendingDatetime!= null)&&this.trendingDatetime.equals(rhs.trendingDatetime))))&&((this.featuredTags == rhs.featuredTags)||((this.featuredTags!= null)&&this.featuredTags.equals(rhs.featuredTags))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.contentUrl == rhs.contentUrl)||((this.contentUrl!= null)&&this.contentUrl.equals(rhs.contentUrl))))&&((this.isSticker == rhs.isSticker)||((this.isSticker!= null)&&this.isSticker.equals(rhs.isSticker))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))))&&((this.analyticsResponsePayload == rhs.analyticsResponsePayload)||((this.analyticsResponsePayload!= null)&&this.analyticsResponsePayload.equals(rhs.analyticsResponsePayload))));
    }

}
