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

## Repository structure
```text
Onerevers-/
├── app/
│   └── src/main/
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── .gitignore
├── README.md
├── docs/
│   └── INTEGRATION_PLAN.md
└── gradlew
```

## Current status
This repository has been initialized as the base project for the integrated Android document suite. It contains the basic Android app structure and the architecture plan needed to continue the implementation.

## Suggested stack
- Kotlin
- Jetpack Compose
- Material 3
- Retrofit / Ktor for backend communication
- Room for local history
- DataStore for app preferences
- Apache Tika and Python conversion service for advanced document processing

## Next steps
1. Add PDF viewer and document-management screens
2. Integrate ClearPDF utilities into the app module
3. Connect Apache Tika extraction API
4. Add PDF-to-Word backend service
5. Implement local storage and file management

## Repository target
This repository is intended to host the final integrated Android product, while the original reference projects remain as sources and examples.
