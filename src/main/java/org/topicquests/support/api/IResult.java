/*
 * Copyright 2020 TopicQuests
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.topicquests.support.api;

/**
 * 
 * @author jackpark
 *
 */
public interface IResult {
	boolean hasError();

	String getErrorString();

	void addErrorString(String var1);

	Object getResultObject();

	void setResultObject(Object var1);

	Object getResultObjectA();

	void setResultObjectA(Object var1);
}
