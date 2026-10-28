# KaatibDocsPro Architecture

## Goal
Build a single Android app that unifies document viewing, PDF tools, office document support, extraction, and conversion.

## Modules

### App module
- UI screens
- ViewModel layer
- Navigation graph
- Data access layer

### Local persistence
- Room for document history
- DataStore for app settings

### Network layer
- Retrofit client for backend services
- API definitions for extraction and conversion endpoints

### Backend services
- Tika service for extraction
- PDF to Word service for conversion

## Recommended production flow
1. User selects a file from device storage
2. App shows metadata and document details
3. User chooses action: view, extract, split, merge, convert
4. App communicates with backend service when needed
5. Result is stored locally and shown in UI

## Integration notes
- Use API layer rather than embedding heavy Java/Python processing logic directly inside the Android app.
- Keep Tika and pdf2word as small backend services for stability and maintainability.
- Keep ClearPDF logic as the main document-processing source for PDF tools.

