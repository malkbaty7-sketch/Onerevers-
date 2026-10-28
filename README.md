# KaatibDocsPro

KaatibDocsPro is a unified Android document management application that combines the original Kaatib app foundation with a professional document-processing toolkit.

## Included capabilities
- PDF viewing and management
- Merge, split, and compress PDF files
- Office document support (DOCX, XLSX, PPTX)
- Text extraction using Apache Tika
- PDF-to-Word conversion via a backend service
- Document scanning and image tools
- Local document archive and file history

## Design philosophy
This project is structured as a single Android app shell that can integrate the best parts of:
- Kaatib (app foundation and user experience)
- ClearPDF (PDF and document toolkit)
- Apache Tika (metadata and text extraction)
- pdf2word (PDF to Word conversion service)

## Current project status
The repository has been initialized as a working Android app shell and now includes:
- Compose-based home screen
- Navigation graph for app screens
- PDF tools screen
- Viewer placeholder
- Extraction screen
- Conversion screen
- Data layer foundation
- Settings abstraction using DataStore
- Retrofit service skeleton for document APIs

## Suggested stack
- Kotlin
- Jetpack Compose
- Material 3
- Retrofit / Ktor for backend communication
- Room for local history
- DataStore for app preferences
- Apache Tika and Python conversion service

## Next implementation stages
1. Add document listing and file picker
2. Add a real PDF document viewer
3. Integrate extraction results screen with API response
4. Implement conversion action with progress state
5. Add Room database and document history persistence
6. Add Arabic UI and localization

## Repository target
This repository is intended to host the final integrated Android product while the original projects remain as references and integration sources.
