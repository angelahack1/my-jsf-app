# JavaServer Faces (JSF) Reference Guide

## Namespaces (xmlns)

### Core JSF Namespaces

```xml
<!-- Core JSF functionality -->
xmlns:f="http://java.sun.com/jsf/core"

<!-- HTML components -->
xmlns:h="http://java.sun.com/jsf/html"

<!-- Facelets templating -->
xmlns:ui="http://java.sun.com/jsf/facelets"

<!-- Composite components -->
xmlns:cc="http://java.sun.com/jsf/composite"

<!-- Pass-through attributes -->
xmlns:p="http://primefaces.org/ui"

<!-- PrimeFaces components (if using PrimeFaces) -->
xmlns:pf="http://primefaces.org/ui"

<!-- RichFaces components (if using RichFaces) -->
xmlns:rich="http://richfaces.org/rich"

<!-- ICEfaces components (if using ICEfaces) -->
xmlns:ice="http://www.icesoft.com/icefaces/component"
```

## HTML Components (h: namespace)

### Form Components

| Tag | Description | Example |
|-----|-------------|---------|
| `h:form` | Creates an HTML form | `<h:form id="myForm">` |
| `h:inputText` | Single-line text input | `<h:inputText value="#{bean.property}" />` |
| `h:inputTextarea` | Multi-line text input | `<h:inputTextarea value="#{bean.property}" rows="3" cols="50" />` |
| `h:inputSecret` | Password input | `<h:inputSecret value="#{bean.password}" />` |
| `h:inputHidden` | Hidden input field | `<h:inputHidden value="#{bean.hiddenValue}" />` |
| `h:selectBooleanCheckbox` | Checkbox | `<h:selectBooleanCheckbox value="#{bean.checked}" />` |
| `h:selectManyCheckbox` | Multiple checkboxes | `<h:selectManyCheckbox value="#{bean.selectedItems}" />` |
| `h:selectOneRadio` | Radio buttons | `<h:selectOneRadio value="#{bean.selectedItem}" />` |
| `h:selectOneListbox` | Single-select dropdown | `<h:selectOneListbox value="#{bean.selectedItem}" />` |
| `h:selectManyListbox` | Multi-select listbox | `<h:selectManyListbox value="#{bean.selectedItems}" />` |
| `h:selectOneMenu` | Dropdown menu | `<h:selectOneMenu value="#{bean.selectedItem}" />` |
| `h:selectManyMenu` | Multi-select dropdown | `<h:selectManyMenu value="#{bean.selectedItems}" />` |

### Command Components

| Tag | Description | Example |
|-----|-------------|---------|
| `h:commandButton` | Button that submits form | `<h:commandButton value="Submit" action="#{bean.method()}" />` |
| `h:commandLink` | Link that submits form | `<h:commandLink value="Click me" action="#{bean.method()}" />` |
| `h:button` | Button that doesn't submit form | `<h:button value="Click" outcome="page.xhtml" />` |
| `h:link` | Regular HTML link | `<h:link value="Go to page" outcome="page.xhtml" />` |

### Output Components

| Tag | Description | Example |
|-----|-------------|---------|
| `h:outputText` | Displays text | `<h:outputText value="#{bean.message}" />` |
| `h:outputLabel` | Label for form elements | `<h:outputLabel for="inputId" value="Name:" />` |
| `h:outputLink` | HTML link | `<h:outputLink value="http://example.com">Link</h:outputLink>` |
| `h:outputFormat` | Formatted text with parameters | `<h:outputFormat value="Hello {0}">` |
| `h:graphicImage` | Image | `<h:graphicImage value="#{bean.imageUrl}" />` |
| `h:message` | Displays validation message | `<h:message for="inputId" />` |
| `h:messages` | Displays all validation messages | `<h:messages />` |

### Data Components

| Tag | Description | Example |
|-----|-------------|---------|
| `h:dataTable` | HTML table | `<h:dataTable value="#{bean.list}" var="item">` |
| `h:column` | Table column | `<h:column><h:outputText value="#{item.name}" /></h:column>` |
| `h:panelGrid` | Grid layout | `<h:panelGrid columns="2">` |
| `h:panelGroup` | Groups components | `<h:panelGroup>` |

### Panel Components

| Tag | Description | Example |
|-----|-------------|---------|
| `h:panelGrid` | Creates HTML table layout | `<h:panelGrid columns="2" cellpadding="5">` |
| `h:panelGroup` | Groups components together | `<h:panelGroup>` |

## Core Components (f: namespace)

### Validation Components

| Tag | Description | Example |
|-----|-------------|---------|
| `f:validateLength` | Validates string length | `<f:validateLength minimum="3" maximum="50" />` |
| `f:validateLongRange` | Validates number range | `<f:validateLongRange minimum="0" maximum="100" />` |
| `f:validateDoubleRange` | Validates decimal range | `<f:validateDoubleRange minimum="0.0" maximum="100.0" />` |
| `f:validateRegex` | Validates against regex | `<f:validateRegex pattern="[A-Za-z]+" />` |
| `f:validateRequired` | Makes field required | `<f:validateRequired />` |
| `f:validateBean` | Bean validation | `<f:validateBean />` |

### Conversion Components

| Tag | Description | Example |
|-----|-------------|---------|
| `f:convertDateTime` | Converts date/time | `<f:convertDateTime pattern="MM/dd/yyyy" />` |
| `f:convertNumber` | Converts numbers | `<f:convertNumber pattern="#,##0.00" />` |
| `f:converter` | Custom converter | `<f:converter converterId="myConverter" />` |

### Event Handling

| Tag | Description | Example |
|-----|-------------|---------|
| `f:actionListener` | Action event listener | `<f:actionListener binding="#{bean.actionListener}" />` |
| `f:valueChangeListener` | Value change listener | `<f:valueChangeListener binding="#{bean.valueChangeListener}" />` |
| `f:phaseListener` | Phase listener | `<f:phaseListener binding="#{bean.phaseListener}" />` |

### Metadata and Configuration

| Tag | Description | Example |
|-----|-------------|---------|
| `f:metadata` | Page metadata | `<f:metadata><f:viewParam name="id" /></f:metadata>` |
| `f:viewParam` | View parameter | `<f:viewParam name="id" value="#{bean.id}" />` |
| `f:viewAction` | View action | `<f:viewAction action="#{bean.init}" />` |
| `f:event` | Event handling | `<f:event type="preRenderView" listener="#{bean.init}" />` |
| `f:ajax` | AJAX functionality | `<f:ajax execute="@form" render="@form" />` |

### Subview and Include

| Tag | Description | Example |
|-----|-------------|---------|
| `f:subview` | Subview for includes | `<f:subview id="subview1">` |
| `f:verbatim` | Raw HTML output | `<f:verbatim><![CDATA[<div>Raw HTML</div>]]></f:verbatim>` |

## Facelets Components (ui: namespace)

### Templating

| Tag | Description | Example |
|-----|-------------|---------|
| `ui:composition` | Template composition | `<ui:composition template="/templates/layout.xhtml">` |
| `ui:define` | Defines content for template | `<ui:define name="content">` |
| `ui:insert` | Inserts content in template | `<ui:insert name="content">` |
| `ui:include` | Includes another page | `<ui:include src="/fragments/header.xhtml" />` |
| `ui:decorate` | Decorates with template | `<ui:decorate template="/templates/decorator.xhtml">` |
| `ui:param` | Passes parameters | `<ui:param name="title" value="My Page" />` |
| `ui:fragment` | Fragment for reuse | `<ui:fragment>` |

### Repeat and Conditional

| Tag | Description | Example |
|-----|-------------|---------|
| `ui:repeat` | Iterates over collection | `<ui:repeat value="#{bean.list}" var="item">` |
| `ui:remove` | Removes content | `<ui:remove>This won't be rendered</ui:remove>` |

## Composite Components (cc: namespace)

| Tag | Description | Example |
|-----|-------------|---------|
| `cc:interface` | Defines component interface | `<cc:interface>` |
| `cc:attribute` | Defines component attribute | `<cc:attribute name="value" required="true" />` |
| `cc:implementation` | Component implementation | `<cc:implementation>` |
| `cc:actionSource` | Action source | `<cc:actionSource name="click" targets="button" />` |
| `cc:valueHolder` | Value holder | `<cc:valueHolder name="input" targets="textField" />` |
| `cc:editableValueHolder` | Editable value holder | `<cc:editableValueHolder name="input" targets="textField" />` |

## Common Attributes

### General Attributes
- `id` - Component ID
- `rendered` - Whether to render component
- `styleClass` - CSS class
- `style` - Inline CSS style
- `title` - Tooltip text
- `disabled` - Disable component
- `readonly` - Make read-only

### Value Binding Attributes
- `value` - Component value
- `binding` - Component binding
- `converter` - Converter
- `validator` - Validator

### Event Attributes
- `action` - Action method
- `actionListener` - Action listener
- `valueChangeListener` - Value change listener
- `click` - Click event
- `change` - Change event

### AJAX Attributes
- `execute` - Components to execute
- `render` - Components to render
- `listener` - AJAX listener
- `onevent` - Event handler
- `onerror` - Error handler

## Example Usage

```xml
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:f="http://java.sun.com/jsf/core"
      xmlns:ui="http://java.sun.com/jsf/facelets">

<h:head>
    <title>JSF Example</title>
</h:head>

<h:body>
    <h:form id="myForm">
        <!-- Input fields -->
        <h:outputLabel for="name" value="Name:" />
        <h:inputText id="name" value="#{userBean.name}" required="true">
            <f:validateLength minimum="2" maximum="50" />
        </h:inputText>
        <h:message for="name" />
        
        <!-- Dropdown -->
        <h:outputLabel for="country" value="Country:" />
        <h:selectOneMenu id="country" value="#{userBean.country}">
            <f:selectItem itemValue="US" itemLabel="United States" />
            <f:selectItem itemValue="CA" itemLabel="Canada" />
        </h:selectOneMenu>
        
        <!-- Button with AJAX -->
        <h:commandButton value="Submit" action="#{userBean.save}">
            <f:ajax execute="@form" render="@form" />
        </h:commandButton>
    </h:form>
    
    <!-- Data table -->
    <h:dataTable value="#{userBean.users}" var="user">
        <h:column>
            <f:facet name="header">Name</f:facet>
            <h:outputText value="#{user.name}" />
        </h:column>
        <h:column>
            <f:facet name="header">Country</f:facet>
            <h:outputText value="#{user.country}" />
        </h:column>
    </h:dataTable>
</h:body>
</html>
```

## Best Practices

1. **Always use proper namespaces** - Include all necessary xmlns declarations
2. **Use meaningful IDs** - Give components descriptive IDs for easier debugging
3. **Validate input** - Use validation tags to ensure data integrity
4. **Use AJAX wisely** - Don't overuse AJAX; consider user experience
5. **Follow naming conventions** - Use consistent naming for beans and properties
6. **Handle errors gracefully** - Always include message components for validation
7. **Use templates** - Leverage Facelets templating for consistent layouts
8. **Optimize performance** - Use rendered attribute to conditionally render components

This reference covers the most commonly used JSF components and attributes. For more advanced features, refer to the official JSF specification and documentation. 