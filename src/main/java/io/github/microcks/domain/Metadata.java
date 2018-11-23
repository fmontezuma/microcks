/*
 * Licensed to Laurent Broudoux (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Author licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.github.microcks.domain;

import java.util.*;

/**
 * @author laurent
 */
public class Metadata {

   private Date createdOn = new Date();
   private Date lastUpdate = new Date();
   private Map<String, String> annotations;
   private Map<String, String> labels;


   /** Mark the related object of this metadata as updated. */
   public void objectUpdated() {
      lastUpdate = new Date();
   }

   /** @return The creation date of the related object. */
   public Date getCreatedOn() {
      return createdOn;
   }

   /** @return The last update date of the related object. */
   public Date getLastUpdate() {
      return lastUpdate;
   }

   /** @return An immutable version of annotations map. */
   public Map<String, String> getAnnotations() {
      if (annotations == null) {
         return null;
      }
      return Collections.unmodifiableMap(annotations);
   }

   /**
    * Add a new annotation or update an existing one within this metadata.
    * @param key The key of the annotation to add / update
    * @param value The value of the annotation to add / update.
    */
   public void setAnnotation(String key, String value) {
      if (key != null && value != null) {
         if (annotations == null) {
            annotations = new HashMap<>();
         }
         annotations.put(key, value);
      }
   }

   /** @return An immutable version of labels map. */
   public Map<String, String> getLabels() {
      if (labels == null) {
         return null;
      }
      return Collections.unmodifiableMap(labels);
   }

   /**
    * Add a new label or update an existing one within this metadata.
    * @param key The key of the label to add / update
    * @param value The value of the label to add / update.
    */
   public void setLabel(String key, String value) {
      if (key != null && value != null) {
         if (labels == null) {
            labels = new HashMap<>();
         }
         labels.put(key, value);
      }
   }
}