/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package example.app.config;

import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableCachingDefinedRegions;

/**
 * The {@link CachingExampleConfiguration} class is the Contacts Application, Caching Example
 * Spring {@link Configuration} class to enable caching using Spring Data Geode along with Apache Geode
 * as the [JSR-107] caching provider.
 *
 * @author John Blum
 * @see org.springframework.data.gemfire.cache.GemfireCacheManager
 * @see org.springframework.data.gemfire.cache.config.EnableGemfireCaching
 * @since 1.0.0
 */
@ClientCacheApplication(name = "CachingExampleApplication")
@EnableCachingDefinedRegions(clientRegionShortcut = ClientRegionShortcut.LOCAL)
@SuppressWarnings("unused")
public class CachingExampleConfiguration {

}
