# Pokemon Frontend

## Task

Using the PokeAPI (https://pokeapi.co/), create a website purely in Angular that allows you to interact with the API through these features:

- Search
    - As a user, I can search for a pokemon using either their number or name
    - The request should be to the pokeapi and the response should be saved and displayed
        - The display should include their: name, sprite, and abilities
        - You can include more if you wish but anymore details should be in a different component
- List
    - As a user, I can see a list of pokemon with their name and sprite
    - Clicking on a pokemon on the list should open up a details view that displays more detail about the chosen pokemon
- Favorite
    - As a user, I can favorite my pokemons and view the favorites in a separate list

## Hints

- You will need to import in `HttpClientModule` and `FormsModule` in the `AppModule`
- You will need to use routing
- You will need to create services to handle the API requests

```typescript
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PokemonService {
  private apiUrl = 'https://pokeapi.co/api/v2';

  constructor(private http: HttpClient) { }

  getPokemon(nameOrId: string) {
    // return observable for getting a pokemon
  }

  getPokemonList() {
    // return observable for a list of pokemon
    // `${this.apiUrl}/pokemon?limit=100`
  }
}
```

- You will need a search, list, details, and favorites component
- Make sure to handle invalid inputs and error handling