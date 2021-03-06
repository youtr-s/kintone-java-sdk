/**
 * MIT License
 *
 * Copyright (c) 2018 Cybozu
 * https://github.com/kintone/kintone-java-sdk/blob/master/LICENSE
 */

package com.cybozu.kintone.client.model.app.form.field.input;

import com.cybozu.kintone.client.model.app.form.field.Field;

public abstract class AbstractInputField extends Field {
    protected String label;
    protected Boolean noLabel;
    protected Boolean required;

    /**
     * @return
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the noLabel
     */
    public Boolean getNoLabel() {
        return this.noLabel;
    }

    /**
     * @param noLabel
     *            the noLabel to set
     */
    public void setNoLabel(Boolean noLabel) {
        this.noLabel = noLabel;
    }

    /**
     * @return
     */
    public Boolean getRequired() {
        return this.required;
    }

    /**
     * @param required
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }
}
