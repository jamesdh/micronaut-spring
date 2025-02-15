/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.spring.tx;

import jakarta.inject.Singleton;
import org.junit.jupiter.api.Assertions;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Singleton
public class TransactionalBean {

    @Transactional
    public String doSomething() {
        // should not throw
        final TransactionStatus transactionStatus = TransactionAspectSupport.currentTransactionStatus();
        Assertions.assertNotNull(transactionStatus);
        return "foo";
    }
}
