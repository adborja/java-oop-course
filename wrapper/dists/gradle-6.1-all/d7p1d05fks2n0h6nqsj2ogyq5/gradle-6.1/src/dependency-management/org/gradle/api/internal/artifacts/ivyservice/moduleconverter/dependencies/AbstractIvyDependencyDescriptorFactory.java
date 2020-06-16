/*
 * Copyright 2007-2008 the original author or authors.
 *
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
 */

package org.gradle.api.internal.artifacts.ivyservice.moduleconverter.dependencies;

import com.google.common.collect.ImmutableList;
import org.gradle.api.Transformer;
import org.gradle.api.artifacts.DependencyArtifact;
import org.gradle.api.artifacts.ExcludeRule;
import org.gradle.internal.component.model.DefaultIvyArtifactName;
import org.gradle.internal.component.model.ExcludeMetadata;
import org.gradle.internal.component.model.IvyArtifactName;
import org.gradle.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public abstract class AbstractIvyDependencyDescriptorFactory implements IvyDependencyDescriptorFactory {
    private ExcludeRuleConverter excludeRuleConverter;

    public AbstractIvyDependencyDescriptorFactory(ExcludeRuleConverter excludeRuleConverter) {
        this.excludeRuleConverter = excludeRuleConverter;
    }

    private String getExtension(DependencyArtifact artifact) {
        return artifact.getExtension() != null ? artifact.getExtension() : artifact.getType();
    }

    protected List<ExcludeMetadata> convertExcludeRules(final String configuration, Set<ExcludeRule> excludeRules) {
        return CollectionUtils.collect((Iterable<ExcludeRule>) excludeRules, new Transformer<ExcludeMetadata, ExcludeRule>() {
            @Override
            public ExcludeMetadata transform(ExcludeRule excludeRule) {
                return excludeRuleConverter.convertExcludeRule(excludeRule);
            }
        });
    }

    protected List<IvyArtifactName> convertArtifacts(Set<DependencyArtifact> dependencyArtifacts) {
        if (dependencyArtifacts.isEmpty()) {
            return Collections.emptyList();
        }
        ImmutableList.Builder<IvyArtifactName> names = ImmutableList.builder();
        for (DependencyArtifact dependencyArtifact : dependencyArtifacts) {
            DefaultIvyArtifactName name = new DefaultIvyArtifactName(dependencyArtifact.getName(), dependencyArtifact.getType(), getExtension(dependencyArtifact), dependencyArtifact.getClassifier());
            names.add(name);
        }
        return names.build();
    }
}
