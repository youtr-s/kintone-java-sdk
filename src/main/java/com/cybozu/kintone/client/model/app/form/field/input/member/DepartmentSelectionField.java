/**
 * MIT License
 *
 * Copyright (c) 2018 Cybozu
 * https://github.com/kintone/kintone-java-sdk/blob/master/LICENSE
 */

package com.cybozu.kintone.client.model.app.form.field.input.member;

import com.cybozu.kintone.client.model.app.form.FieldType;

public class DepartmentSelectionField extends AbstractMemberSelectField {
    /**
     * @param code
     */
    public DepartmentSelectionField(String code) {
        this.code = code;
        this.type = FieldType.ORGANIZATION_SELECT;
    }
}
