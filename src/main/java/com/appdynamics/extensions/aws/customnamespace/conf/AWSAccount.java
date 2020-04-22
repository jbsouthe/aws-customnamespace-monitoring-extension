/*
 * Copyright 2020. AppDynamics LLC and its affiliates.
 * All Rights Reserved.
 * This is unpublished proprietary source code of AppDynamics LLC and its affiliates.
 * The copyright notice above does not evidence any actual or intended publication of such source code.
 *
 */

package com.appdynamics.extensions.aws.customnamespace.conf;

import com.appdynamics.extensions.aws.config.Account;

import java.util.Set;

/**
 * @author Prashant Mehta
 *
 */
public class AWSAccount extends Account {
	private String namespace;

    private Set<String> includeMetrics;

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespaces) {
		this.namespace = namespace;
	}


	public Set<String> getIncludeMetrics() {
		return includeMetrics;
	}

	public void setIncludeMetrics(Set<String> includeMetrics) {
		this.includeMetrics = includeMetrics;
	}
}
