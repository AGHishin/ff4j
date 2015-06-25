package org.ff4j.web.store;

/*
 * #%L
 * ff4j-web
 * %%
 * Copyright (C) 2013 - 2015 Ff4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import org.ff4j.FF4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStore {
    
    @Test
    public void testRay() {
        ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("spring-context.xml");
        FF4j ff4j = appCtx.getBean(FF4j.class);
        System.out.println(ff4j.getFeatures().keySet());
        
    }

}
