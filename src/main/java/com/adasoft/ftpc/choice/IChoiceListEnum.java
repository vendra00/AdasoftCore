package com.adasoft.ftpc.choice;

public interface IChoiceListEnum {
    String msg();

    String meaning();

    Long val();

    boolean editable();

    boolean selectable();

    boolean visible();

    String messageId();

    String choiceListNameInternal();

    String choiceListDescriptionInternal();

    boolean choiceListAlphabetizedInternal();

    boolean choiceListEditableInternal();

    String choiceListMessagePackInternal();
}
