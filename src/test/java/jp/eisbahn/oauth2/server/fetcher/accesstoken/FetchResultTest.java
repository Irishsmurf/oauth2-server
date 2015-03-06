/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package jp.eisbahn.oauth2.server.fetcher.accesstoken;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import jp.eisbahn.oauth2.server.fetcher.accesstoken.AccessTokenFetcher.FetchResult;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FetchResultTest {

	private FetchResult target;

	@Before
	public void setUp() {
		target = new FetchResult();
	}

	@After
	public void tearDown() {
		target = null;
	}

	@Test
	public void testTokenProperty() throws Exception {
		String token = "token1";
		target.setToken(token);
		assertEquals(token, target.getToken());
	}

	@Test
	public void testParamsProperty() throws Exception {
		Map<String, String[]> params = new HashMap<String, String[]>();
		target.setParams(params);
		assertEquals(params, target.getParams());
	}

}
