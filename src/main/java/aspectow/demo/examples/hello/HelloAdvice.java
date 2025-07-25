/*
 * Copyright (c) 2019-present The Aspectran Project
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
package aspectow.demo.examples.hello;

import com.aspectran.core.activity.Translet;
import com.aspectran.core.component.bean.annotation.Bean;
import com.aspectran.core.component.bean.annotation.Component;
import com.aspectran.core.component.bean.annotation.Description;
import com.aspectran.utils.annotation.jsr305.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Bean("helloAdvice")
@Description("Defines the Advice Bean that has the Advice Method to be injected before and after the Action Method.")
public class HelloAdvice {

    private static final Logger logger = LoggerFactory.getLogger(HelloAdvice.class);

    public String welcome() {
        String msg = "Welcome to Aspectran!";

        logger.info(msg);

        return msg;
    }

    public String goodbye(@NonNull Translet translet) {
        logger.info("activityData {}", translet.getActivityData());

        String msg = "Goodbye!";

        logger.info(msg);

        return msg;
    }

}
