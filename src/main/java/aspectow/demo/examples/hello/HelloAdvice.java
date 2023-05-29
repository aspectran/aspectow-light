/*
 * Copyright (c) 2008-2023 The Aspectran Project
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
import com.aspectran.core.util.logging.Logger;
import com.aspectran.core.util.logging.LoggerFactory;

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

    public String goodbye(Translet translet) {
        logger.info("activityData " + translet.getActivityData());

        String msg = "Goodbye!";

        logger.info(msg);

        return msg;
    }

}