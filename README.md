# Spring Web Application (XML-config version)

## What we did so far:
- Configured our dispatcher servlet
- Implemented simple custom error-page
- Added view-resolver
- Made simple get and post requests
- Added static resource handling (css)
- Added Internationalization (2 resource bundles)
- Added a way to upload a file to the server
  - We will maybe use a db to upload to later
  - The service for this can be easily switched out
- Added an example of method validation on file name in 'FileUploadController'
- Added a Employee form (Spring form) with:
  - Validation using a model & BindingResult
- Quick mongo implementation to show employees inserted by this form
  - We will add proper dao for mongo and mySQL later
- Added birth form with:
  - A Custom validator
  - Type conversions using PropertyEditorSupport  
  (For other option: Converter, see [this](https://stackoverflow.com/questions/12544479/spring-mvc-type-conversion-propertyeditor-or-converter))

## Validation
<img width="500" src="https://raw.githubusercontent.com/H3AR7B3A7/SpringServletStackXml/master/validation.png" alt="fc"><br>