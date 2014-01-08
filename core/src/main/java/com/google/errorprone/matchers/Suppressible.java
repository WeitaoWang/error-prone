/*
 * Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.errorprone.matchers;

import java.util.Set;

/**
 * @author alexeagle@google.com (Alex Eagle)
 */
public interface Suppressible {
  // FIXME(eaftan): Should customSuppressionAnnotation be here as well?  It's kind of different
  // but still has to do with suppression.  Maybe I should refactor this?
  Set<String> getAllNames();
}