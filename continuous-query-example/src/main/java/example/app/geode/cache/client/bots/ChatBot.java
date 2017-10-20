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

package example.app.geode.cache.client.bots;

import example.app.geode.cache.client.model.Chat;
import example.app.model.Person;

/**
 * The {@link ChatBot} interface defines a contract for {@link Chat} bots.
 *
 * @author John Blum
 * @see example.app.geode.cache.client.model.Chat
 * @see example.app.model.Person
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public interface ChatBot {

  /**
   * Generates a new {@link Chat}.
   *
   * @return a new {@link Chat}.
   * @see example.app.geode.cache.client.model.Chat
   */
  Chat chat();

  /**
   * Finds all {@link Chat Chats} for the given {@link Person}.
   *
   * @param person {@link Person} to retrieve all {@link Chat Chats} for.
   * @return all {@link Chat Chats} for the given {@link Person}.
   * @see example.app.geode.cache.client.model.Chat
   * @see example.app.model.Person
   * @see java.lang.Iterable
   */
  Iterable<Chat> findAll(Person person);

  /**
   * Finds a single, random {@link Chat} for the given {@link Person}.
   *
   * @param person {@link Person} to retrieve a {@link Chat} for.
   * @return a single, random {@link Chat} for the given {@link Person}.
   * @see example.app.geode.cache.client.model.Chat
   * @see example.app.model.Person
   */
  Chat findOne(Person person);

}
