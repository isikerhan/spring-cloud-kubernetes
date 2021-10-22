/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.kubernetes.fabric8.config.include_profile_specific_sources.controller;

import org.springframework.cloud.kubernetes.fabric8.config.include_profile_specific_sources.properties.One;
import org.springframework.cloud.kubernetes.fabric8.config.include_profile_specific_sources.properties.Three;
import org.springframework.cloud.kubernetes.fabric8.config.include_profile_specific_sources.properties.Two;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncludeProfileSpecificSourcesController {

	private final One one;

	private final Two two;

	private final Three three;

	public IncludeProfileSpecificSourcesController(One one, Two two, Three three) {
		this.one = one;
		this.two = two;
		this.three = three;
	}

	@GetMapping("/profile-specific/one")
	public String one() {
		return one.getProperty();
	}

	@GetMapping("/profile-specific/two")
	public String two() {
		return two.getProperty();
	}

	@GetMapping("/profile-specific/three")
	public String three() {
		return three.getProperty();
	}

}
