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
 * TransactionHashes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-28T19:50:06.335-03:00")
public class TransactionHashes {
  @SerializedName("hashes")
  private List<String> hashes = null;

  public TransactionHashes hashes(List<String> hashes) {
    this.hashes = hashes;
    return this;
  }

  public TransactionHashes addHashesItem(String hashesItem) {
    if (this.hashes == null) {
      this.hashes = new ArrayList<String>();
    }
    this.hashes.add(hashesItem);
    return this;
  }

   /**
   * Get hashes
   * @return hashes
  **/
  @ApiModelProperty(example = "[\"5AF72FE39C0515E823903918A0BFE9625DD752C7BD63969C8869F25E9D155DE5\"]", value = "")
  public List<String> getHashes() {
    return hashes;
  }

  public void setHashes(List<String> hashes) {
    this.hashes = hashes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionHashes transactionHashes = (TransactionHashes) o;
    return Objects.equals(this.hashes, transactionHashes.hashes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionHashes {\n");
    
    sb.append("    hashes: ").append(toIndentedString(hashes)).append("\n");
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
