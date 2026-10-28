# KaatibDocsPro Architecture

## System overview
KaatibDocsPro is a document suite for Android that combines a mobile frontend with document processing services.

## Main layers
### 1. Android app layer
Responsibilities:
- UI and navigation
- file selection
- document list
- PDF tools menu
- extraction screen
- conversion screen
- settings

### 2. Local persistence layer
- Room database for document history
- DataStore for app settings

### 3. Network layer
- Retrofit client for backend communication
- Moshi for API serialization

### 4. Backend services
- Tika service for extraction
- PDF-to-Word service for conversion

## Recommended production architecture
```text
Android app (Compose)
    |
    +--> Local DB (Room)
    |
    +--> API Client (Retrofit)
             |
             +--> Tika service
             |
             +--> PDF2Word service
```

## Future implementation priorities
1. Integrate real document viewer and PDF engine
2. Hook up actual file picker and permission logic
3. Connect to real Tika server endpoint
4. Connect to real conversion service endpoint
5. Add robust error handling and progress states
6. Add Arabic localization and final design polish

