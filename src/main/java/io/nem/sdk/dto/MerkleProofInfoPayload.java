/*
 * Copyright 2019 NEM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.nem.sdk.dto;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MerkleProofInfoPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-28T19:50:06.335-03:00")
public class MerkleProofInfoPayload {
  @SerializedName("merklePath")
  private List<MerklePathItem> merklePath = null;

  public MerkleProofInfoPayload merklePath(List<MerklePathItem> merklePath) {
    this.merklePath = merklePath;
    return this;
  }

  public MerkleProofInfoPayload addMerklePathItem(MerklePathItem merklePathItem) {
    if (this.merklePath == null) {
      this.merklePath = new ArrayList<MerklePathItem>();
    }
    this.merklePath.add(merklePathItem);
    return this;
  }

   /**
   * Get merklePath
   * @return merklePath
  **/
  @ApiModelProperty(value = "")
  public List<MerklePathItem> getMerklePath() {
    return merklePath;
  }

  public void setMerklePath(List<MerklePathItem> merklePath) {
    this.merklePath = merklePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerkleProofInfoPayload merkleProofInfoPayload = (MerkleProofInfoPayload) o;
    return Objects.equals(this.merklePath, merkleProofInfoPayload.merklePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merklePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerkleProofInfoPayload {\n");
    
    sb.append("    merklePath: ").append(toIndentedString(merklePath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
