package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.core.model.annotations.BelongsTo;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Post type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Posts", authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
@Index(name = "byUser", fields = {"userId"})
public final class Post implements Model {
  public static final QueryField ID = field("Post", "id");
  public static final QueryField USER_ID = field("Post", "userId");
  public static final QueryField POST_BODY = field("Post", "postBody");
  public static final QueryField PICTURE_KEY = field("Post", "pictureKey");
  public static final QueryField CREATED_AT = field("Post", "createdAt");
  public static final QueryField POSTED_BY = field("Post", "userPostsId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="ID", isRequired = true) String userId;
  private final @ModelField(targetType="String", isRequired = true) String postBody;
  private final @ModelField(targetType="String", isRequired = true) String pictureKey;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime createdAt;
  private final @ModelField(targetType="User") @BelongsTo(targetName = "userPostsId", type = User.class) User postedBy;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getUserId() {
      return userId;
  }
  
  public String getPostBody() {
      return postBody;
  }
  
  public String getPictureKey() {
      return pictureKey;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public User getPostedBy() {
      return postedBy;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Post(String id, String userId, String postBody, String pictureKey, Temporal.DateTime createdAt, User postedBy) {
    this.id = id;
    this.userId = userId;
    this.postBody = postBody;
    this.pictureKey = pictureKey;
    this.createdAt = createdAt;
    this.postedBy = postedBy;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Post post = (Post) obj;
      return ObjectsCompat.equals(getId(), post.getId()) &&
              ObjectsCompat.equals(getUserId(), post.getUserId()) &&
              ObjectsCompat.equals(getPostBody(), post.getPostBody()) &&
              ObjectsCompat.equals(getPictureKey(), post.getPictureKey()) &&
              ObjectsCompat.equals(getCreatedAt(), post.getCreatedAt()) &&
              ObjectsCompat.equals(getPostedBy(), post.getPostedBy()) &&
              ObjectsCompat.equals(getUpdatedAt(), post.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getUserId())
      .append(getPostBody())
      .append(getPictureKey())
      .append(getCreatedAt())
      .append(getPostedBy())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Post {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("userId=" + String.valueOf(getUserId()) + ", ")
      .append("postBody=" + String.valueOf(getPostBody()) + ", ")
      .append("pictureKey=" + String.valueOf(getPictureKey()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("postedBy=" + String.valueOf(getPostedBy()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static UserIdStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static Post justId(String id) {
    return new Post(
      id,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      userId,
      postBody,
      pictureKey,
      createdAt,
      postedBy);
  }
  public interface UserIdStep {
    PostBodyStep userId(String userId);
  }
  

  public interface PostBodyStep {
    PictureKeyStep postBody(String postBody);
  }
  

  public interface PictureKeyStep {
    CreatedAtStep pictureKey(String pictureKey);
  }
  

  public interface CreatedAtStep {
    BuildStep createdAt(Temporal.DateTime createdAt);
  }
  

  public interface BuildStep {
    Post build();
    BuildStep id(String id);
    BuildStep postedBy(User postedBy);
  }
  

  public static class Builder implements UserIdStep, PostBodyStep, PictureKeyStep, CreatedAtStep, BuildStep {
    private String id;
    private String userId;
    private String postBody;
    private String pictureKey;
    private Temporal.DateTime createdAt;
    private User postedBy;
    @Override
     public Post build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Post(
          id,
          userId,
          postBody,
          pictureKey,
          createdAt,
          postedBy);
    }
    
    @Override
     public PostBodyStep userId(String userId) {
        Objects.requireNonNull(userId);
        this.userId = userId;
        return this;
    }
    
    @Override
     public PictureKeyStep postBody(String postBody) {
        Objects.requireNonNull(postBody);
        this.postBody = postBody;
        return this;
    }
    
    @Override
     public CreatedAtStep pictureKey(String pictureKey) {
        Objects.requireNonNull(pictureKey);
        this.pictureKey = pictureKey;
        return this;
    }
    
    @Override
     public BuildStep createdAt(Temporal.DateTime createdAt) {
        Objects.requireNonNull(createdAt);
        this.createdAt = createdAt;
        return this;
    }
    
    @Override
     public BuildStep postedBy(User postedBy) {
        this.postedBy = postedBy;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String userId, String postBody, String pictureKey, Temporal.DateTime createdAt, User postedBy) {
      super.id(id);
      super.userId(userId)
        .postBody(postBody)
        .pictureKey(pictureKey)
        .createdAt(createdAt)
        .postedBy(postedBy);
    }
    
    @Override
     public CopyOfBuilder userId(String userId) {
      return (CopyOfBuilder) super.userId(userId);
    }
    
    @Override
     public CopyOfBuilder postBody(String postBody) {
      return (CopyOfBuilder) super.postBody(postBody);
    }
    
    @Override
     public CopyOfBuilder pictureKey(String pictureKey) {
      return (CopyOfBuilder) super.pictureKey(pictureKey);
    }
    
    @Override
     public CopyOfBuilder createdAt(Temporal.DateTime createdAt) {
      return (CopyOfBuilder) super.createdAt(createdAt);
    }
    
    @Override
     public CopyOfBuilder postedBy(User postedBy) {
      return (CopyOfBuilder) super.postedBy(postedBy);
    }
  }
  
}
